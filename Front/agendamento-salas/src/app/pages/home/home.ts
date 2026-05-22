import { ChangeDetectorRef, Component } from '@angular/core';
import { SelectComponent } from "../../components/select-component/select-component";
import { SalaService } from '../../services/sala/sala-service';
import { ColaboradorService } from '../../services/colaborador/colaborador-service';
import { AgendamentoService } from '../../services/agendamentos/agendamento-service';
import { TabelaComponent } from "../../components/tabela-component/tabela-component";

@Component({
  selector: 'app-home',
  imports: [SelectComponent, TabelaComponent],
  templateUrl: './home.html',
  styleUrl: './home.css',
})
export class Home {

  salas: any[] = [];
  colaboradores: any[] = [];
  agendamentos: any[] = [];

   constructor(
    private readonly colaboradorService: ColaboradorService,
    private readonly salaService: SalaService, 
    private readonly agendamentosService: AgendamentoService,
    private readonly cdr: ChangeDetectorRef) {
    }

    ngOnInit() {
        this.buscarSalas();
        this.buscarColaborador();
        this.buscarAgendamentos();
    }

    buscarSalas(){
     this.salaService.buscarTodasSalas().subscribe(
     (response)=>{
       this.salas = response; 
       this.cdr.detectChanges();
      }
     )
    }

    buscarColaborador(){
      this.colaboradorService.buscarColaboradores().subscribe(
        (response)=>{
          this.colaboradores = response;
          this.cdr.detectChanges();
        }
      )
    }
    
    buscarAgendamentos(){
      this.agendamentosService.buscarColaboradores().subscribe(
        (response)=>{
          this.agendamentos = response;
          this.cdr.detectChanges();
          console.log(this.agendamentos)
        }
      )
    }
}
