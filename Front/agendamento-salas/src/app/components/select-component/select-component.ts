import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-select-component',
  imports: [CommonModule],
  templateUrl: './select-component.html',
  styleUrls: ['./select-component.css'],
})
export class SelectComponent{

private _lista: any[] = [];

  @Input() lista: any[] = [];
  @Input() nomeChave: string = 'id';    // Nome do campo de ID (padrão 'id')
  @Input() nomeExibicao: string = 'nome'; // Nome do campo de Texto (padrão 'nome')
}
