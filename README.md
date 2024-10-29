# 

## Model
www.msaez.io/#/487999/storming/complainment-2

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- receipt
- payment
- user
- search
- 통계
- 연계
- 주문
- 게시판
- 게시판2


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- receipt
```
 http :8088/complainments id="id" 민원사무번호="민원사무번호" 회원id="회원ID" 민원상세="민원상세" 
```
- payment
```
 http :8088/fees id="id" 접수번호="접수번호" 수수료="수수료" 
```
- user
```
 http :8088/users id="id" 주민번호="주민번호" 
```
- search
```
 http :8088/searchEngines id="id" 
```
- 통계
```
 http :8088/starSchemes id="id" 
```
- 연계
```
 http :8088/연계 id="id" 
```
- 주문
```
 http :8088/주문 id="id" class300S="class300s" 총액="총액" 
```
- 게시판
```
 http :8088/게시물 id="id" 내용="내용" 댓글수="댓글수" 댓글Id="댓글Id" 
 http :8088/댓글 id="id" 게시물Id="게시물Id" 내용="내용" 
```
- 게시판2
```
 http :8088/게시물 id="id" 내용="내용" 댓글수="댓글수" 댓글="댓글" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

