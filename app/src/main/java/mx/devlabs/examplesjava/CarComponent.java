package mx.devlabs.examplesjava;

import dagger.Component;

//The injector
@Component
public  interface CarComponent {

    Car getCar();
}
