#Running docker for postgress and PGAdmin

docker run --name pg -e POSTGRES_USER=root -e POSTGRES_PASSWORD=pass -p 5432:5432 -d postgres
docker run --name pgadmin-container -p 5050:80 -e PGADMIN_DEFAULT_EMAIL=a@b.com -e PGADMIN_DEFAULT_PASSWORD=pass -d dpage/pgadmin4
docker pull dpage/pgadmin4
docker pull postgres
docker ps
docker container rm fd860cfdf8e0 -f
