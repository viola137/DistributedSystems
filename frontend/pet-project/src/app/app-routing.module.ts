import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PetsComponent } from './petview/petview.component';

const routes: Routes = [
  {path: 'petview', component: PetsComponent},
  {path: '', redirectTo: '/petview', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
