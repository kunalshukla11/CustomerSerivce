use docker host for running endpoints like 192.168.99.100 windows mac (localhost)
use docker run to run mongoDb instance 
windows --> docker run -p 27107:27017 --name <any_name> <imageName>:<tag>
mac --> docker run -p  27107:27017 --name mongoDb <imageName>:<tag>
and then run the service
windows --> docker run -d -p 8080:8080  --name customerapp customerimage
mac- > docker run -d -p 8080:8080  --link mongoDb --name customerapp customerimage

With docker compose
docker-compose up -d --run all services in detached mode
docker compose ps --see what services run by docker compose
docker-compose logs -f -t view logs for all services
docker-compose logs -f -t <particular service> OR docker logs -f -t <containerId/containerName>
//TODO
Add security to the endpoints 