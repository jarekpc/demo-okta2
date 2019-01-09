import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class CarService {

  public API = environment.baseUrl;
  public CAR_API = this.API + '/cars';

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    // return this.http.get('//localhost:8080/cool-cars')
    console.log("pobieramy dane z adresu ", this.API + '/cool-cars');
    console.log("Inny adres ", "http://registration0.us-east-1.elasticbeanstalk.com")
    return this.http.get(this.API + '/cool-cars');
  }

  get(id: string){
    return this.http.get(this.CAR_API + '/' + id);
  }

  save(car: any):Observable<any>{
    let result: Observable<Object>;
    if(car['href']){
      result = this.http.put(car.href, car);
    } else {
      result = this.http.post(this.CAR_API, car);
    }
    return result;
  }

  remove(href: string){
    console.log("href ", href);
    return this.http.delete(href);
  }
}
