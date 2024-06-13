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
  </div>
      <strong>구성요소:</strong> <br/> 
      <strong>TreeMap:</strong><br/>
      OTT 서비스 종류를 키로 사용하여 각 서비스의 상세 정보를 저장합니다.<br/>
      &emsp;키: OTT 서비스 이름 (String)<br/>
      &emsp;값: OTT 서비스 상세 정보 (OTTService 객체)<br/>
      <br/>
      <strong>HashMap:</strong><br/>
      각 OTT 서비스의 상세 정보를 관리합니다.<br/>
      &emsp;인원수별 가격 (Key: 인원수, Value: 가격)<br/>
      &emsp;최신 콘텐츠 업데이트 (String)<br/>
      &emsp;이용자 수 (int)
    
 
