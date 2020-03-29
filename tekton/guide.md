## 사전작업
- pr-image.yaml에서 private image registry 주소 수정
- plr/plr plr-springboot-sample.yaml 에서 maven mirror 주소 수정

## How to deploy with tekton on OCP
$ cd tekton   
$ oc apply -f . -n <project>   
$ oc apply -f plr/springboot-sample.yaml -n <project>   
$ oc apply -f plr/plr plr-springboot-sample.yaml -n <project>   
   
## How to check in progress   
$ oc get pipelinerun -n <project>   
또는   
OCP web console에서 확인   

## How to test
$ oc get route -n <project>   
결과에서 route url을 copy하여 웹브라우저에서 확인


