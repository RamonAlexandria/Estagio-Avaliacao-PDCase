import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class SalaService {
    constructor(
      private readonly httpClient: HttpClient
    ) {
    }
    buscarTodasSalas(){
      const url = "http://localhost:8080/salas/buscar";
      return this.httpClient.get<any>(url);
    }
}
