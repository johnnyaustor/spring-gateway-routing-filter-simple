# spring-gateway-routing-filter-simple
contoh menggunakan edge service routing menggunakan spring-cloud-starter-zuul.
ini akan membuat sebuah routing untuk memanggil micro-service lainya

#### jalankan semua service:

* gateway: http://localhost:8080

* books: http://localhost:8090/avaible

* users: http://localhost:8091/all

#

untuk melakukan test memanggil users di gateway, akses dengan
http://localhost:8080/users/all atau memanggil books di gateway 
ke  http://localhost:8080/books/avaible

