import { JsonPipe } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, inject } from '@angular/core';

@Component({
  standalone: true,
  imports: [JsonPipe],
  selector: 'executable-poc-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'executable-app-ui';
  response = '';

  private http = inject(HttpClient);

  hello() {
    this.http.get('/api/hello').subscribe((res) => {
      console.log(res);
      this.response = res as string;
    });
  }
}
