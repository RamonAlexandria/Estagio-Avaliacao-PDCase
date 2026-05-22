import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ColaboradorService {
    constructor(
      private readonly httpClient: HttpClient
      
    ) {
      
    }
    buscarColaboradores() {
      const url = "http://localhost:8080/colaboradores/buscar";
      return this.httpClient.get<any>(url);
    }
}
