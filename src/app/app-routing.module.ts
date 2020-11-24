import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchComponent } from './search/search.component';
import { TaxComponent } from './tax/tax.component';

const routes: Routes = [

  // {path:"",pathMatch:"full",component:SearchComponent},
  {path:'tax',component:TaxComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
