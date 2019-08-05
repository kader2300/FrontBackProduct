import { Component, OnInit } from '@angular/core';
import { CatalogueService } from '../services/catalogue.service';
import { Router } from '@angular/router';
import { Product } from '../model/product.model';

@Component({
  selector: 'app-new-products',
  templateUrl: './new-products.component.html',
  styleUrls: ['./new-products.component.css']
})
export class NewProductsComponent implements OnInit {
  public currentProduct:Product;
  public mode:  number=1;
  constructor(private catalogueService:CatalogueService, private router:Router) { }

  ngOnInit() {
  }
  onSaveProduct(data:any){

    this.catalogueService.saveResource(this.catalogueService.host+"/produits",data).subscribe(res=>{
      console.log(res);
      //this.router.navigateByUrl("/products");
      this.currentProduct=res;
      this.mode=2;
    },err=>{
      console.log(err);

    });
  }
  onNewProduct(){
    this.mode=1;
  }

}
