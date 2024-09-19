import { Component } from '@angular/core';
import { Appointment } from '../appointment';
import { AppointmentService } from '../appointment.service';

@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css']
})
export class AppointmentComponent {

appointments:Appointment[]=[];
constructor(private appointmentService:AppointmentService){}

ngOnInit():void{
  this.getAppointments();

}

getAppointments(){
  this.appointmentService.getAppointment().subscribe(data=>{
    this.appointments=data;
  })
}

}
