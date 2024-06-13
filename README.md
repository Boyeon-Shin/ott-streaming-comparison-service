<div align="center">
  <h1>OTT-streaming-comparison-service</h1>

  <em>OTT 스트리밍 정보 제공해 구매자가 구매를 결정하는 데 도움을 주는 서비스</em>
  <br/>
  <br/>

  <strong>프로젝트 구성원:</strong><br/>
  20221023 신보연<br/>
  20221042 허소영<br/>
  20222637 조수빈<br/>
  20221018 박소영

  <br/>
  <h3>다양한 OTT 스트리밍 종류들</h3>
  <img src="https://github.com/Boyeon-Shin/ott-streaming-service/assets/141127815/42b0a714-af38-497d-bd0e-b8abc5aa24d6" width="600" height="400"/>

<br/>
<br/>

## 개요<br/>
이 프로젝트는 여러 OTT스트리밍 서비스의 가격을 관리하고, </br>
사용자에게 각 서비스의 가격 정보를 제공하여 구매 결정을 돕는 서비스입니다. </br>
각 OTT 서비스의 인원수별 가격, 최신 컨텐츠 업데이트, 이용자 수 등을 관리하고, </br> 경쟁사와의 가격 비교를 통해 최적의 선택을 할 수 있도록 지원합니다.
</div>

<div align=center>

<br/> 
<br/>

**<구성요소>** <br/>
<br/>

<div align=left>

&emsp;&emsp;&nbsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;  • **TreeMap**:   OTT 서비스 종류를 키로 사용하여 각 서비스의 상세 정보를 저장합니다.<br/>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;키: OTT 서비스 이름 (String)<br/>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;값: OTT 서비스 상세 정보 (OTTService 객체)<br/>
<br/>

&emsp;&emsp;&nbsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;  • **HashMap**:  각 OTT 서비스의 상세 정보를 관리합니다.<br/>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;인원수별 가격 (Key: 인원수, Value: 가격)<br/>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;최신 컨텐츠 업데이트 (String)<br/>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;이용자 수 (int)

  


