import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CatalogueService } from '../services/catalogue.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit {
  public produits:any;
  public size=5;
  public currentPage:number=0;
  public totalPages:number;
  public pages:Array<number>;
  private currentKeyword: string;
  constructor(private catService:CatalogueService, private router:Router) { }

  ngOnInit() {

  }
  onGetProducts(){
    this.catService.getProducts(this.currentPage,this.size).subscribe(data=>{
      this.totalPages=data["page"].totalPages;
      this.pages=new Array<number>(this.totalPages)
      this.produits=data;

    },err=>{
      console.log(err);
    })
   
  }
  onPageProducts(i){
    this.currentPage=i;
    this.chercherProduit();
  }

  onChercher(form:any){
    this.currentPage=0;
    this.currentKeyword=form.keyword;
    this.chercherProduit();
  }
  chercherProduit(){
      this.catService.getProductsByKeyword(this.currentKeyword,this.currentPage,this.size).subscribe(data=>{
      this.totalPages=data["page"].totalPages;
      this.pages=new Array<number>(this.totalPages)
      this.produits=data;

    },err=>{
      console.log(err);
    })

  }
  onDeleteProduct(p){
      let conf=confirm("etes vous sur?");
      if(conf){
        this.catService.deleteRessource(p._links.self.href).subscribe(data=>{
          this.chercherProduit();
        },err=>{
          console.log(err);
        })
      }
      console.log(p);
  }
  onEditProduct(p){
    let url=p._links.self.href;
    this.router.navigateByUrl("/edit-product/"+btoa(url));
  }
}
