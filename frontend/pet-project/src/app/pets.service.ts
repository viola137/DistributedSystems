import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pets } from './pets';

@Injectable({
  providedIn: 'root'
})
export class PetsService {

  API_URL = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  getPets(): Observable<Pets[]> {
    const url = this.API_URL+"/rest/pets/all";
    const headers = new HttpHeaders().set('Accept', 'application/json');

    return this.http.get<Pets[]>(url, {headers});
  }

  getPetById(id: any): Observable<Pets> {
    const url = this.API_URL+"/rest/pets/" + id;
    const headers = new HttpHeaders().set('Accept', 'application/json');

    return this.http.get<Pets>(url, {headers});
  }


  createPet(pet: Pets): Observable<Pets> {
    const url = this.API_URL+"/rest/pets/add";
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.post<Pets>(url, JSON.stringify(pet), {headers});
  } 

  editPet(pet: Pets): Observable<Pets> {
    const url = this.API_URL+"/rest/pets/edit";
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.put<Pets>(url, JSON.stringify(pet), {headers});
  } 
  
  deletePet(id: any): Observable<String> {
    const url = this.API_URL+"/rest/pets/delete/" + id;
    const headers = new HttpHeaders().set('Content-Type', 'application/json');

    return this.http.delete<String>(url, {headers});
  }

}
