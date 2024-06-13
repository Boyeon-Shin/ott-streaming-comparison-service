<div align="center">
  <h1>OTT-streaming-comparison-service</h1>

  <em>OTT 스트리밍 정보 제공해 구매자가 구매를 결정하는 데 도움을 주는 서비스</em>
  <br/>
  <br/>

  <strong>프로젝트 구성원:</strong><br/>
  20221023 신보연 (메인 코드 작성 및 완성)<br/> 
  20221042 허소영 (메인 코드 작성 및 완성)<br/>
  20222637 조수빈 (read me 작성 완성)<br/>
  20221018 박소영 (read me 작성 및 코드 작성 도움)

  <br/>
  <h3>다양한 OTT 스트리밍 종류들</h3>
  <img src="https://github.com/Boyeon-Shin/ott-streaming-service/assets/141127815/42b0a714-af38-497d-bd0e-b8abc5aa24d6" width="600" height="400"/>

<br/>
<br/>

## 개요<br/>
이 프로젝트는 여러 OTT스트리밍 서비스의 ${\textsf{\color{red}가격}}$을 관리하고, </br>
사용자에게 각 서비스의 가격 정보를 제공하여 ${\textsf{\color{red}구매결정}}$을 돕는 서비스입니다. </br>
각 OTT 서비스의 유형별 가격, 최신 컨텐츠 업데이트, 이용자 수 등을 관리하고, </br> 경쟁사와의 가격 비교를 통해 최적의 선택을 할 수 있도록 지원합니다.
</div>

<div align=center>

<br/> 
<br/>

**<활용한 OTT 종류>**
<br/>

NETFLEX &ensp;/&ensp; TVING &ensp;/&ensp; COUPANG PLAY &ensp;/&ensp; WAVVE &ensp; /&ensp; DISNEY+

<br/>

**<구성요소>** <br/>
<br/>

<div align=left>

&emsp;&emsp;&nbsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;  • **TreeMap**:   OTT 서비스 종류를 키로 사용하여 각 서비스의 상세 정보를 저장합니다.<br/>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;키: OTT 서비스 이름 (String)<br/>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;값: OTT 서비스 상세 정보 (OTTService 객체)<br/>
<br/>

  <div align=center>

  **<사용법>** 


 (대/소문자 구분 X) <br/>
 
<div align=left>
&emsp;&emsp;&nbsp;&emsp;&emsp;&emsp;•<strong> NETFLEX &ensp;/&ensp; TVING &ensp;/&ensp; COUPANG PLAY &ensp;/&ensp; WAVVE &ensp; /&ensp; DISNEY+</strong> 5개의 OTT중 하나를 선택 또는 exit<br/>
&emsp;&emsp;&nbsp;&emsp;&emsp;&emsp;• 옳지 않은 OTT 선택 시 오류 메세지 후 다시 요청 <br/>
&emsp;&emsp;&nbsp;&emsp;&emsp;&emsp;• 요금제 타입 선택 <br/>
&emsp;&emsp;&nbsp;&emsp;&emsp;&emsp;• 결과 도출<br/>
</br>
    
  <div align=center>
    <strong><결과></strong></br></br>
<img width="403" alt="OTT" src="https://github.com/Boyeon-Shin/ott-streaming-comparison-service/assets/141127815/df31519d-c78b-4c2f-acfe-81e06ab0a2bc"> <br/><br/>
<img width="403" alt="image" src="https://github.com/Boyeon-Shin/ott-streaming-comparison-service/assets/141127815/6e9e64c2-c25e-4a2c-8f90-dccdee370e86"> <br/><br/>
<img width="403" alt="KakaoTalk_Photo_2024-06-13-16-23-18" src="https://github.com/Boyeon-Shin/ott-streaming-comparison-service/assets/141127815/e939270c-b14d-4b36-8e7d-b661836507cd"> <br/><br/>
<img width="403" alt="KakaoTalk_Photo_2024-06-13-16-23-23" src="https://github.com/Boyeon-Shin/ott-streaming-comparison-service/assets/141127815/9ac75068-f29e-4918-8d8d-a7d44337ac86"> 


</div>

  


