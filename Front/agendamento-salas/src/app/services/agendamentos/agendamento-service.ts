import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AgendamentoService {
    constructor(
      private readonly httpClient: HttpClient

    ) {

    }
      buscarColaboradores() {
        const url = "http://localhost:8080/agendamentos/buscar";
        return this.httpClient.get<any>(url);
      }
}
