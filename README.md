# Spring Boot MicroService 
Spring Boot MicroService app using Skaffold for CICD in Kubernetes

Step1: 

kubectl get deploy spring-boot-microservice -o yaml 

Step 2:

kubectl get deploy spring-boot-microservice -o yaml | linkerd inject - | kubectl apply -f -