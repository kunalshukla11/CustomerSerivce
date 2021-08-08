use docker host for running endpoints like 192.168.99.100
use docker run to run mongoDb instance 
docker run -p 27107:27017 --name <any_name> <imageName>:<tag>
and then run the service

//TODO 
Use docker compose file to run this service instead of running db and service seperately