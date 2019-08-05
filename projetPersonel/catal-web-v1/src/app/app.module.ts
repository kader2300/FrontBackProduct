import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProduitsComponent } from './produits/produits.component';
import { AppRoutingModule } from './app-routing.module';
import { NewProductsComponent } from './new-products/new-products.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { EditProductComponent } from './edit-product/edit-product.component';

@NgModule({
  declarations: [
    AppComponent,
    ProduitsComponent,
    NewProductsComponent,
    EditProductComponent
  ],
  imports: [
    BrowserModule, HttpClientModule,AppRoutingModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
