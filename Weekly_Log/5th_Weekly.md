# 아이디어톤 2팀 5주차 Weekly_Log

9월 05일(월) 참여자 : 최태승, 손정아, 김동현2, 박종수, 이승훈


<br>

## 팀 구성원, 개인 별 역할

<hr>

최태승
1) 카테고리별 마커 띄우기 개발, 카테고리 이미지 채워넣기

<br>

손정아
1) 카테고리별 마커띄우기 구현, 카테고리 이미지 채워넣기
2) 전체폰트변경
3) 중간지점찾기 버튼 위치, 디자인변경
박종수 : Git 관리 및 개발 지원

<br>

김동현2
1) resource 파일 리팩토링(html, js 분리)
2) 일정 크기 (로그아웃 시 가로 830px 이하, 로그인시 1056px 이하)로 축소 시 페이지 떨림 현상 해결
: gps 버튼과 스크롤 겹쳐서 일어났던 현상. right값 주어서 해결함.
3) 간헐적으로 맵이 뜨지 않는 문제 -> 로컬스토리지 문제 해결(로그아웃 시 데이터 remove), 맵 api 스크립트 태그 head에 위치시킴.
4) 창을 급격히 줄였다가 갑자기 늘리면 지도 축척 컨트롤이 사라지는 문제
: 기본 api controll이기 때문에 css 변경 불가함.
5) 로그아웃 시 맵 api 뜨지 않는 현상 해결
: 스프링 시큐리티와 충돌하는 오류 해결
6) 네비게이션바 항목 수정, 상단 로고 폰트 수정함.
7) 현재 위치, EAT TWO 버튼 수정(네비게이션과 색상 통일), 경위도 표시 hidden 처리 
8) footer 로고 추가, 문구 삽입함.

<br>

이승훈
1) 채팅방 구현 : 삭제 및 입장 기능 재구현
2) 테스트 디버깅 : js 파일 분리로 인한 시큐리티 문제 해결
3) 분리된 기능 코드 통합
4) 전체 코드 주석 :프로젝트 전체 코드 주석 처리
5) 코드 리팩토링 => 마커 클릭 시 게시판 내용 출력을 즉각적으로 DB에 요청하도록 수정 

박종수 

<br>

## 팀 내부 회의 진행 회차 및 일자

<hr>

(1) 23회차 (08-29) 디스코드 진행(모두 참여) 오류 수정
(2) 24회차 (08-30) 디스코드 진행(모두 참여) 오류 수정
(3) 25회차 (08-31) 디스코드 진행(모두 참여) 오류 수정
(4) 26회차 (09-01) 디스코드 진행(모두 참여) 오류 수정 
(5) 27회차 (09-02) 디스코드 진행(모두 참여) 오류 수정

<br>

### 현재까지 개발 과정 요약

<hr>
<br>

필수 기본 기능 구현 완료


<br>

## 수정해야 하는 버그 정리, 개발 과정에서 나온 질문

<hr><br>

A. 메인페이지

1. 보유기능

(1) 페이지 오픈 (맵 띄우기) -> 로컬스토리지 문제 해결 된 듯
(2) eat two 버튼 클릭 - 로그인 시 / 로그아웃 시
(3) 네비게이션 바 클릭 - 로그인 시 / 로그아웃 시 
(4) GPS 마커 생성
(5) 마커게시판 생성 기능, 생성 시 핀 위치 가운데에 있게 함.
(6) 마커게시판 필터기능(아직 구현중)

2. 발견 버그

1) - 1. 일정 크기 (로그아웃 시 가로 830px 이하, 로그인시 1056px 이하)로 축소 시 페이지 떨림 현상
1) - 2. 간헐적으로 맵이 뜨지 않는 문제 -> 로컬스토리지 문제 해결(로그아웃 시 데이터 remove), 맵 api 스크립트 태그 head에 위치시킴. 일어나지 않는 것으로 보아 해결 된 것으로 보임
1) - 3. 창을 급격히 줄였다가 갑자기 늘리면 지도 축척 컨트롤이 사라지는 문제

2) 발견된 버그 없음

3) 발견된 버그 없음. 다만, 버튼 정리 필요함

4) GPS 마커 중복 생성
-> 다른 곳으로 갔다가 재생성 시 마커가 두 개 생김.
-> GPS 마커가 마커게시판을 가려서 그 위치에 있는 마커게시판 클릭이 되지 않음(gps z-index 문제)

5) 로컬스토리지로 이전 위치 기억하게 함. 버그는 없음.

6) 미구현됨


3. UI 수정 필요 부분

1) 네비게이션바 항목 수정, 상단 로고 폰트 수정
2) 현재 위치, EAT TWO 버튼 수정(네비게이션과 색상 통일), 경위도 표시 hidden 처리
3) footer 로고 추가, 문구 삽입
4) 중간지점 찾기 탭 삭제, activity log 수정 또는 삭제


4. 추가 기능 추천

1) 브라우저 창 일정 크기 이하로 줄어들지 못하게 하는 기능 추가 필요

2) 마커게시판 수정, 삭제 기능 구현(게시자만 탭 볼 수 있도록)

3) 마커 생성 시 현재위치, 검정 핀 hidden(마커게시판 가려질 수 있는 문제 조심)

4) 카테고리 구현 완료 필요.


<hr><br>

B. 메인 - 마커게시판 상세모달


1. 보유기능

1) 중간 지점 찾기로 이동

2) 채팅하기(자신의 마커게시판이 아닌 경우) 버튼으로 채팅방 생성 가능

3) 닫기 버튼

4) DB에 저장된 마커게시판의 정보 불러오기 기능(javascript)


2. 발견 버그

1) 마커게시판 상세모달을 띄워놓고 네비게이션 바 메뉴 클릭 시 이상현상
-> 채팅방으로 이동하고 다시 돌아오면 검정핀이 가리키던 자리가 아니라 서울시청 핀으로 돌아옴 (로컬스토리지 데이터가 남아있지 않는 문제로 추정됨)

2) 이외에 특별한 버그는 보이지 않음.

3) 마커게시판 정보 불러올 때, for문 써서 나타내는 것 말고 GET 방식으로 불러오는 것 필요.


3. UI 수정 필요 부분

1) 위도, 경도 가리기

2) 중간지점 찾기, 채팅하기, 닫기 버튼

3) 게시글 정보 제목 수정

4) 닫기 버튼 삭제(우측 상단)

5) 최소 주문 금액, 배달요금 ‘원’ 표시



4. 추가 기능 추천

1) 게시자인 경우 삭제, 수정 기능 추가


<hr><br>

C. 메인 - 마커게시판 생성모달


1. 보유기능

1) 마커게시판 생성, DB에 데이터 저장(board)

2) 검정핀 위치에 마커게시판 형상을 띄운다.


2. 발견 버그

현재 발견된 버그는 없음.


3. UI 수정 필요 부분

1) 위도, 경도 가리기

4. 추가 기능 추천

1) 금액, 요금 항목 int 값으로만 받을 것.

2) 생성하기 버튼에 onclick 메서드로 검은pin, 현재위치 없애는 것 필요

3) user_info에 마커게시판 생성 여부를 0, 1로 표시해서, 생성된 경우 1, 생성하지 않은 경우 0으로 데이터 넣어서 메인 화면을 다르게 볼 수 있었으면 어떨까 함.

4) 기타사항 글자 수 200자 정도로 제한


<hr><br>


D. 채팅방


1. 보유기능

1) 메인페이지에서 채팅 생성 시 채팅방으로 들어갈 수 있는 기능

2) 각 방 마다 채팅 기능이 존재함.


2. 발견 버그

1) 채팅방 생성 후 닉네임 변경 시 기존 채팅방이 보이지 않음.
-> 회원가입, 로그인, 회원정보변경과 관련하여 허용 기능, 불가 기능 정리하여 수정할 필요가 있을 것 같음.

2) 회원상세정보 드롭다운 박스 내려오지 않음.

3) 특수문자, 공백 추가 시 버튼 클릭되지 않는 문제가 있었으나 수정함(8/25)


3. UI 수정 필요 부분

1) 마우스 hover 시 손가락이 변경되는 등의 이펙트 추가 필요

2) 게시판 내 화면 디자인 필요

3) 초 단위 소수점 삭제(생성일 정리)


4. 추가 기능 추천

1) 마커게시판 삭제 연동 기능(이 사람과 거래 기능)

2) 왼쪽 네비게이션바에 ‘내 채팅 목록’으로 전체 채팅목록을 두는 것 고려 필요

3) 엔터치면 전송되는 것

4) 채팅 알람

5) 수신한 채팅 컨텐츠 개수 숫자 표시

6) 유저 탈퇴시 ‘존재하지 않는 사용자 입니다’ 표시

7) 채팅방 수정 삭제


<hr><br>

E. 중간 지점 찾기


1. 보유기능

1) 특정 마커게시판과 현재 나의 위치를 기준으로 중간 거리를 알려 줌

2) 중간 지점 반경 250m를 알려주고, 지점 마커를 생성해서 그 지점을 목적지로 하는 카카오 길찾기 외부 페이지로 랜딩하는 기능


2. 발견 버그

1) 네비게이션 바에서 삭제 필요

2) 내 위치, 마커게시판 위치, 중간 위치 모든 핀이 나올 수 있도록 지도 위치 자동 조절이 필요.


3. UI 수정 필요 부분

1) 나, 상대방, 중간 지점 위치 핀 이미지 변경 필요

2) 중간 위치 보여주는 박스 디자인 수정 필요.


4. 추가 기능 추천

없음.

<hr><br>

F. 로그인, 회원정보수정


1. 보유기능


2. 발견 버그

1) PW 찾기 -> 가입은 되어 있으나 유효하지 않은 테스트 이메일(ex. user.com) 인 경우, pw 찾기 시 500 오류

(오류 내용)
There was an unexpected error (type=Internal Server Error, status=500).
Authentication failed; nested exception is javax.mail.AuthenticationFailedException: 535-5.7.8 Username and Password not accepted.


3. UI 수정 필요 부분

1) ID/PW 찾기 Email 인증 부분 placeholder = “E-mail” 로 변경 필요


4. 추가 기능 추천

1) 계정 삭제 시 마커게시판 정보 삭제 연동

<hr><br>

G. 회원가입


1. 보유기능

1) 닉네임, 이메일, 비밀번호 수집 후 user_info 데이터 생성


2. 발견 버그




3. UI 수정 필요 부분

1) 못생김


4. 추가 기능 추천

1) ‘비밀번호 확인’ 기능 필요




### 결과물 공유

<hr>


<br>

### 팀사진

<hr>
<img width="686" alt="image" src="https://user-images.githubusercontent.com/96964263/188395540-9b442bba-95a4-4c2f-b52b-d10845e50ba9.png">

