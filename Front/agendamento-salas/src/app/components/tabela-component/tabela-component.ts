import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-tabela-component',
  imports: [],
  templateUrl: './tabela-component.html',
  styleUrl: './tabela-component.css',
})
export class TabelaComponent {
  @Input() lista: any[] = [];
}
