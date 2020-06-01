# 通用游戏运营API


<a name="overview"></a>
## 概观
开黑三国接口文档说明


### URI scheme
*域名* : 192.168.85.125:52001  
*基础路径* : /api


### 标签

* action-log-controller : 行为日志，个人邮件
* external-service-controller : 外部服务调用
* game-controller : 配置相关信息
* game-data-statistics-controller : 统计数据
* login-controller : 个人信息
* player-action-controller : 玩家信息
* player-action-group-controller : 玩家行为组
* sys-user-controller : 系统用户
* 二期 : 公告管理




<a name="paths"></a>
## 资源

<a name="action-log-controller_resource"></a>
### Action-log-controller
行为日志，个人邮件


<a name="playerusingpost"></a>
#### 玩家行为日志
```
POST /actionLog/player
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Body**|**logRequest**  <br>*必填*|logRequest|[玩家行为日志查询](#edca7e2c54012bd148517e667aa208fb)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«PlayerActionLog»](#4a015fa0b3b45341394fc5a4c822eba9)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/actionLog/player
```


###### 请求 body
```
json :
{
  "beginTime" : "string",
  "channelId" : "string",
  "defaultTimeFlag" : true,
  "endTime" : "string",
  "groupCode" : "string",
  "pageSize" : 0,
  "pagingState" : "string",
  "playerId" : "string",
  "playerName" : "string",
  "serverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "gamePlayer" : {
      "allianceId" : "string",
      "avatar" : "string",
      "channelId" : 0,
      "currency" : 0,
      "data" : {
        "string" : "string"
      },
      "disabledChat" : true,
      "disabledLogin" : true,
      "fighting" : 0,
      "gameCurrency" : 0,
      "level" : 0,
      "nickname" : "string",
      "platformUserId" : "string",
      "playerId" : "string",
      "serverId" : 0,
      "updateAt" : "string",
      "vip" : 0
    },
    "lastPage" : true,
    "pagingState" : "string",
    "playerActions" : [ {
      "action" : "string",
      "channelId" : 0,
      "createAt" : "string",
      "currency" : 0,
      "data" : "object",
      "gameCurrency" : 0,
      "levelId" : "string",
      "obtainedProps" : [ "object" ],
      "platform" : 0,
      "playerId" : "string",
      "remark" : "string",
      "serverId" : 0,
      "usedProps" : [ "object" ]
    } ]
  },
  "message" : "string"
}
```


<a name="external-service-controller_resource"></a>
### External-service-controller
外部服务调用


<a name="addusingpost_3"></a>
#### 新增服务
```
POST /externalServiceCall
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Body**|**addRequest**  <br>*必填*|addRequest|[外部服务调用实体](#a02fa58bc4d7008b2fdc0aed70ca0193)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse»](#83cc6adcf22012ee86d8f649a295cba2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/externalServiceCall
```


###### 请求 body
```
json :
{
  "method" : "string",
  "params" : "string",
  "remark" : "string",
  "serviceName" : "string",
  "url" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : "object"
  },
  "message" : "string"
}
```


<a name="listusingget_3"></a>
#### 服务列表
```
GET /externalServiceCall
```


##### 参数

|类型|名称|说明|架构|默认列|
|---|---|---|---|---|
|**Query**|**limit**  <br>*可选*|limit|integer(int32)|`"10"`|
|**Query**|**page**  <br>*可选*|page|integer(int32)|`"1"`|
|**Query**|**serviceName**  <br>*可选*|serviceName|string||


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«ExternalServiceCallPageResponse»](#f316079da3e5b0b005ccba71e910615e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/externalServiceCall
```


###### 请求 query
```
json :
{
  "limit" : 0,
  "page" : 0,
  "serviceName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "externalServiceCalls" : [ {
      "createdTime" : 0,
      "id" : 0,
      "method" : "string",
      "params" : "string",
      "remark" : "string",
      "serviceCode" : "string",
      "serviceName" : "string",
      "status" : 0,
      "updatedTime" : 0,
      "url" : "string"
    } ]
  },
  "message" : "string"
}
```


<a name="executeusingpost"></a>
#### 排行榜服务调用
```
POST /externalServiceCall/execute
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Body**|**params**  <br>*必填*|params|[ExternalExecuteParamsRequest](#externalexecuteparamsrequest)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«List«RankList»»](#27da09df06d0c59a4b5a85f4eda43da8)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/externalServiceCall/execute
```


###### 请求 body
```
json :
{
  "params" : {
    "string" : "string"
  },
  "serviceCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "data" : [ {
      "detail" : "object",
      "playerId" : "string",
      "playerName" : "string",
      "rankId" : 0
    } ],
    "type" : "string"
  } ],
  "message" : "string"
}
```


<a name="updateusingput"></a>
#### 修改服务
```
PUT /externalServiceCall/{serviceId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**serviceId**  <br>*必填*|serviceId|integer(int32)|
|**Body**|**updateRequest**  <br>*必填*|updateRequest|[外部服务调用实体](#a02fa58bc4d7008b2fdc0aed70ca0193)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse»](#83cc6adcf22012ee86d8f649a295cba2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/externalServiceCall/0
```


###### 请求 body
```
json :
{
  "method" : "string",
  "params" : "string",
  "remark" : "string",
  "serviceName" : "string",
  "url" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : "object"
  },
  "message" : "string"
}
```


<a name="deleteusingdelete"></a>
#### 禁用服务
```
DELETE /externalServiceCall/{serviceId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**serviceId**  <br>*必填*|serviceId|integer(int32)|
|**Query**|**status**  <br>*必填*|status|enum (OFF, ON)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse»](#83cc6adcf22012ee86d8f649a295cba2)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/externalServiceCall/0
```


###### 请求 query
```
json :
{
  "status" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : "object"
  },
  "message" : "string"
}
```


<a name="game-controller_resource"></a>
### Game-controller
配置相关信息


<a name="getchannelidsusingget"></a>
#### 获取渠道
```
GET /gameConfig/channelIds
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«List«渠道实体»»](#c5cd016f5d23e94f75f23f87ee1aee19)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/gameConfig/channelIds
```


###### 请求 header
```
json :
0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "channelCode" : "string",
    "channelId" : "string"
  } ],
  "message" : "string"
}
```


<a name="getgameidusingget"></a>
#### 获取游戏id
```
GET /gameConfig/gameId
```


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«游戏id实体»](#b18e450e32a6088306cb8c919ff3ff6e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/gameConfig/gameId
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "gameId" : "string"
  },
  "message" : "string"
}
```


<a name="game-data-statistics-controller_resource"></a>
### Game-data-statistics-controller
统计数据


<a name="dailykpiusingget"></a>
#### 日报
```
GET /statistics/dailyKpi
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**beginTime**  <br>*可选*||string(date-time)|
|**Query**|**channelId**  <br>*可选*||string|
|**Query**|**endTime**  <br>*可选*||string(date-time)|
|**Query**|**limit**  <br>*可选*||integer(int32)|
|**Query**|**page**  <br>*可选*||integer(int32)|
|**Query**|**platform**  <br>*可选*|设备类型|integer(int32)|
|**Query**|**serverId**  <br>*可选*||string|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«StatisticsResponse»](#045c4a3ce2809e1de1ade23cc54aa2f2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/statistics/dailyKpi
```


###### 请求 query
```
json :
{
  "beginTime" : "string",
  "channelId" : "string",
  "endTime" : "string",
  "limit" : 0,
  "page" : 0,
  "platform" : 0,
  "serverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ "object" ]
  },
  "message" : "string"
}
```


<a name="expendandlevelusingget"></a>
#### 消耗/层级统计。元宝统计、铜钱统计、征战进度统计、试练塔统计
```
GET /statistics/expendAndLevel
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**beginTime**  <br>*可选*||string(date-time)|
|**Query**|**channelId**  <br>*可选*||string|
|**Query**|**endTime**  <br>*可选*||string(date-time)|
|**Query**|**limit**  <br>*可选*||integer(int32)|
|**Query**|**page**  <br>*可选*||integer(int32)|
|**Query**|**platform**  <br>*可选*|设备类型|integer(int32)|
|**Query**|**serverId**  <br>*可选*||string|
|**Query**|**statisticsType**  <br>*可选*|GOLD("元宝统计"),CASH("铜钱统计"),WARPATH("征战进度统计"),TEST_TOWER("试练塔统计")|enum (GOLD, CASH, WARPATH, TEST_TOWER)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«StatisticsResponse»](#045c4a3ce2809e1de1ade23cc54aa2f2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/statistics/expendAndLevel
```


###### 请求 query
```
json :
{
  "beginTime" : "string",
  "channelId" : "string",
  "endTime" : "string",
  "limit" : 0,
  "page" : 0,
  "platform" : 0,
  "serverId" : "string",
  "statisticsType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ "object" ]
  },
  "message" : "string"
}
```


<a name="ltvusingget"></a>
#### LTV统计
```
GET /statistics/ltv
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**beginTime**  <br>*可选*||string(date-time)|
|**Query**|**channelId**  <br>*可选*||string|
|**Query**|**endTime**  <br>*可选*||string(date-time)|
|**Query**|**limit**  <br>*可选*||integer(int32)|
|**Query**|**page**  <br>*可选*||integer(int32)|
|**Query**|**platform**  <br>*可选*|设备类型|integer(int32)|
|**Query**|**serverId**  <br>*可选*||string|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«StatisticsResponse»](#045c4a3ce2809e1de1ade23cc54aa2f2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/statistics/ltv
```


###### 请求 query
```
json :
{
  "beginTime" : "string",
  "channelId" : "string",
  "endTime" : "string",
  "limit" : 0,
  "page" : 0,
  "platform" : 0,
  "serverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ "object" ]
  },
  "message" : "string"
}
```


<a name="rechargeusingget"></a>
#### 充值总额
```
GET /statistics/recharge
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**beginTime**  <br>*可选*||string(date-time)|
|**Query**|**channelId**  <br>*可选*||string|
|**Query**|**endTime**  <br>*可选*||string(date-time)|
|**Query**|**limit**  <br>*可选*||integer(int32)|
|**Query**|**page**  <br>*可选*||integer(int32)|
|**Query**|**platform**  <br>*可选*|设备类型|integer(int32)|
|**Query**|**serverId**  <br>*可选*||string|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«StatisticsResponse»](#045c4a3ce2809e1de1ade23cc54aa2f2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/statistics/recharge
```


###### 请求 query
```
json :
{
  "beginTime" : "string",
  "channelId" : "string",
  "endTime" : "string",
  "limit" : 0,
  "page" : 0,
  "platform" : 0,
  "serverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ "object" ]
  },
  "message" : "string"
}
```


<a name="userrateusingget"></a>
#### 用户留存统计
```
GET /statistics/userRate
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**beginTime**  <br>*可选*||string(date-time)|
|**Query**|**channelId**  <br>*可选*||string|
|**Query**|**endTime**  <br>*可选*||string(date-time)|
|**Query**|**limit**  <br>*可选*||integer(int32)|
|**Query**|**page**  <br>*可选*||integer(int32)|
|**Query**|**platform**  <br>*可选*|设备类型|integer(int32)|
|**Query**|**serverId**  <br>*可选*||string|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«StatisticsResponse»](#045c4a3ce2809e1de1ade23cc54aa2f2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/statistics/userRate
```


###### 请求 query
```
json :
{
  "beginTime" : "string",
  "channelId" : "string",
  "endTime" : "string",
  "limit" : 0,
  "page" : 0,
  "platform" : 0,
  "serverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ "object" ]
  },
  "message" : "string"
}
```


<a name="login-controller_resource"></a>
### Login-controller
个人信息


<a name="loginusingpost"></a>
#### 登陆
```
POST /login
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Body**|**loginRequest**  <br>*必填*|loginRequest|[LoginRequest](#loginrequest)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SysUserLoginResponse»](#6166917bdbfa36cd1ed7fe340bf2fa4a)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/login
```


###### 请求 body
```
json :
{
  "passwd" : "string",
  "userCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "avatar" : "string",
    "email" : "string",
    "id" : 0,
    "phone" : "string",
    "remark" : "string",
    "token" : "string",
    "userCode" : "string",
    "userName" : "string"
  },
  "message" : "string"
}
```


<a name="updateusingput_1"></a>
#### 修改个人信息
```
PUT /profile
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|
|**Body**|**updateRequest**  <br>*必填*|updateRequest|[用户请求修改实体](#bc683849faf584b794d3e1f362015a3c)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse»](#83cc6adcf22012ee86d8f649a295cba2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/profile
```


###### 请求 header
```
json :
0
```


###### 请求 body
```
json :
{
  "avatar" : "string",
  "email" : "string",
  "passwd" : "string",
  "phone" : "string",
  "remark" : "string",
  "userName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : "object"
  },
  "message" : "string"
}
```


<a name="player-action-controller_resource"></a>
### Player-action-controller
玩家信息


<a name="playerusingpost_1"></a>
#### 个人信息
```
POST /player/info
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Body**|**playerInfoRequest**  <br>*必填*|playerInfoRequest|[玩家个人信息查询](#3c1b83e0989333ad9395249ea2fd71f8)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«PlayerInfo»](#68ac8bece28b1d11d87d227567090108)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/player/info
```


###### 请求 body
```
json :
{
  "channelId" : "string",
  "pageSize" : 0,
  "pagingState" : "string",
  "playerId" : "string",
  "playerName" : "string",
  "serverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "lastPage" : true,
    "pagingState" : "string",
    "players" : [ {
      "allianceId" : "string",
      "avatar" : "string",
      "channelId" : 0,
      "currency" : 0,
      "data" : {
        "string" : "string"
      },
      "disabledChat" : true,
      "disabledLogin" : true,
      "fighting" : 0,
      "gameCurrency" : 0,
      "level" : 0,
      "nickname" : "string",
      "platformUserId" : "string",
      "playerId" : "string",
      "serverId" : 0,
      "updateAt" : "string",
      "vip" : 0
    } ]
  },
  "message" : "string"
}
```


<a name="player-action-group-controller_resource"></a>
### Player-action-group-controller
玩家行为组


<a name="addusingpost_5"></a>
#### 新增行为组
```
POST /actionGroup
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Body**|**addRequest**  <br>*必填*|addRequest|[新增组对象](#ee7742115341fb13a60dcd754acbcf00)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/actionGroup
```


###### 请求 body
```
json :
{
  "actions" : [ "string" ],
  "groupCode" : "string",
  "groupName" : "string",
  "openStatistics" : "string",
  "remark" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="listusingget_5"></a>
#### 行为组列表
```
GET /actionGroup
```


##### 参数

|类型|名称|说明|架构|默认列|
|---|---|---|---|---|
|**Query**|**limit**  <br>*可选*|limit|integer(int32)|`"10"`|
|**Query**|**page**  <br>*可选*|page|integer(int32)|`"1"`|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«PlayerActionGroupPageResponse»](#867872e9dc16ba5b1f2c3f10d8415f7c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/actionGroup
```


###### 请求 query
```
json :
{
  "limit" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "groups" : [ {
      "action" : "string",
      "createdTime" : 0,
      "groupCode" : "string",
      "groupName" : "string",
      "id" : 0,
      "openStatistics" : 0,
      "remark" : "string",
      "updatedTime" : 0
    } ]
  },
  "message" : "string"
}
```


<a name="getgameeventsusingget"></a>
#### 获取行为列表
```
GET /actionGroup/events
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**gameId**  <br>*必填*|gameId|string|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«List«GameEventsResponse»»](#5fe912824eb35e6fc60e0f4eb9f65b42)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/actionGroup/events
```


###### 请求 query
```
json :
{
  "gameId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "actionCode" : "string",
    "actionName" : "string"
  } ],
  "message" : "string"
}
```


<a name="getopenstatisticsgroupusingget"></a>
#### 获取统计组列表
```
GET /actionGroup/getByGroupCode
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**sign**  <br>*必填*|sign|string|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«List«ActionByGroupCodeResponse»»](#012f34b6bf5340a1df785577664b4aeb)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/actionGroup/getByGroupCode
```


###### 请求 query
```
json :
{
  "sign" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "actions" : [ "string" ],
    "groupCode" : "string",
    "groupName" : "string"
  } ],
  "message" : "string"
}
```


<a name="updateusingput_2"></a>
#### 修改行为组
```
PUT /actionGroup/{groupId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**groupId**  <br>*必填*|groupId|integer(int32)|
|**Body**|**updateRequest**  <br>*必填*|updateRequest|[修改组对象](#8d144b1924cfa508bdb258c6a6671514)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/actionGroup/0
```


###### 请求 body
```
json :
{
  "actions" : [ "string" ],
  "groupName" : "string",
  "openStatistics" : "string",
  "remark" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="deleteusingdelete_1"></a>
#### 删除行为组
```
DELETE /actionGroup/{groupId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**groupId**  <br>*必填*|groupId|integer(int32)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/actionGroup/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="sys-user-controller_resource"></a>
### Sys-user-controller
系统用户


<a name="addusingpost_6"></a>
#### 新增用户
```
POST /admin
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|
|**Body**|**addRequest**  <br>*必填*|addRequest|[用户请求实体](#79849b8d98f8ae0eabf3fad8a3b050ae)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse»](#83cc6adcf22012ee86d8f649a295cba2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/admin
```


###### 请求 header
```
json :
0
```


###### 请求 body
```
json :
{
  "avatar" : "string",
  "email" : "string",
  "passwd" : "string",
  "phone" : "string",
  "remark" : "string",
  "roleId" : 0,
  "userCode" : "string",
  "userName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : "object"
  },
  "message" : "string"
}
```


<a name="listusingget_7"></a>
#### 用户列表
```
GET /admin
```


##### 参数

|类型|名称|说明|架构|默认列|
|---|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)||
|**Query**|**limit**  <br>*可选*|limit|integer(int32)|`"10"`|
|**Query**|**page**  <br>*可选*|page|integer(int32)|`"1"`|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SysUserPageResponse»](#9d9dcee3da56bf895740850bb30896c4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/admin
```


###### 请求 header
```
json :
0
```


###### 请求 query
```
json :
{
  "limit" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "sysUsers" : [ {
      "avatar" : "string",
      "createdTime" : 0,
      "email" : "string",
      "id" : 0,
      "operId" : 0,
      "phone" : "string",
      "remark" : "string",
      "roleId" : 0,
      "status" : 0,
      "updatedTime" : 0,
      "userCode" : "string",
      "userName" : "string"
    } ]
  },
  "message" : "string"
}
```


<a name="updateusingput_3"></a>
#### 修改用户
```
PUT /admin/{userId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|
|**Path**|**userId**  <br>*必填*|userId|integer(int32)|
|**Body**|**updateRequest**  <br>*必填*|updateRequest|[用户请求实体](#79849b8d98f8ae0eabf3fad8a3b050ae)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse»](#83cc6adcf22012ee86d8f649a295cba2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/admin/0
```


###### 请求 header
```
json :
0
```


###### 请求 body
```
json :
{
  "avatar" : "string",
  "email" : "string",
  "passwd" : "string",
  "phone" : "string",
  "remark" : "string",
  "roleId" : 0,
  "userCode" : "string",
  "userName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : "object"
  },
  "message" : "string"
}
```


<a name="deleteusingdelete_2"></a>
#### 删除用户
```
DELETE /admin/{userId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**userId**  <br>*必填*|userId|integer(int32)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse»](#83cc6adcf22012ee86d8f649a295cba2)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/admin/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : "object"
  },
  "message" : "string"
}
```


<a name="49459ec7275f8f65b44e65d627335dee"></a>
### 二期
公告管理


<a name="getrolepermissionusingget"></a>
#### 获取角色具有的权限
```
GET /admin/role/getRolePermission
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**roleId**  <br>*必填*|roleId|integer(int32)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«RolePermissionResponse»](#7f61807d91de8675c6469b03926d62a4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/admin/role/getRolePermission
```


###### 请求 query
```
json :
{
  "roleId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "permissions" : {
      "buttons" : [ "string" ],
      "channels" : [ "string" ],
      "menus" : [ "string" ],
      "sysUser" : {
        "avatar" : "string",
        "createdTime" : 0,
        "email" : "string",
        "id" : 0,
        "operId" : 0,
        "phone" : "string",
        "remark" : "string",
        "roleId" : 0,
        "status" : 0,
        "updatedTime" : 0,
        "userCode" : "string",
        "userName" : "string"
      }
    },
    "roleInfo" : {
      "createdTime" : 0,
      "roleId" : 0,
      "roleName" : "string",
      "status" : 0,
      "updatedTime" : 0
    }
  },
  "message" : "string"
}
```


<a name="listusingget_6"></a>
#### 角色列表
```
GET /admin/role/list
```


##### 参数

|类型|名称|说明|架构|默认列|
|---|---|---|---|---|
|**Query**|**limit**  <br>*可选*|limit|integer(int32)|`"10"`|
|**Query**|**page**  <br>*可选*|page|integer(int32)|`"1"`|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«RoleResponse»](#aa0f699160d83482f4d8b6a2844868b1)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/admin/role/list
```


###### 请求 query
```
json :
{
  "limit" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "sysRoles" : [ {
      "createdTime" : 0,
      "roleId" : 0,
      "roleName" : "string",
      "status" : 0,
      "updatedTime" : 0
    } ]
  },
  "message" : "string"
}
```


<a name="setrolepermissionusingpost"></a>
#### 新增/修改角色，并为角色授权
```
POST /admin/role/setRolePermission
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Body**|**permisssionRequest**  <br>*必填*|permisssionRequest|[PermisssionRequest](#permisssionrequest)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse»](#83cc6adcf22012ee86d8f649a295cba2)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/admin/role/setRolePermission
```


###### 请求 body
```
json :
{
  "permissions" : {
    "buttons" : [ "string" ],
    "channels" : [ "string" ],
    "menus" : [ "string" ],
    "sysUser" : {
      "avatar" : "string",
      "createdTime" : 0,
      "email" : "string",
      "id" : 0,
      "operId" : 0,
      "phone" : "string",
      "remark" : "string",
      "roleId" : 0,
      "status" : 0,
      "updatedTime" : 0,
      "userCode" : "string",
      "userName" : "string"
    }
  },
  "roleId" : 0,
  "roleName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : "object"
  },
  "message" : "string"
}
```


<a name="addusingpost"></a>
#### 新增公告申请
```
POST /announcement/add
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|
|**Body**|**infoRequest**  <br>*必填*|infoRequest|[AnnouncementInfoAddRequest](#announcementinfoaddrequest)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/announcement/add
```


###### 请求 header
```
json :
0
```


###### 请求 body
```
json :
{
  "anocmtContent" : "string",
  "anocmtSendTime" : "string",
  "anocmtTitle" : "string",
  "anocmtTypeId" : 0,
  "channelId" : "string",
  "serverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="auditusingput"></a>
#### 公告审批
```
PUT /announcement/audit/{recordId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**recordId**  <br>*必填*|recordId|integer(int32)|
|**Query**|**auditStatus**  <br>*必填*|auditStatus|enum (INIT, PASS, REJECT)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/announcement/audit/0
```


###### 请求 query
```
json :
{
  "auditStatus" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="getannouncementtypesusingget"></a>
#### 获取公告类型
```
GET /announcement/getTypes
```


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«List«AnnouncementTypeResponse»»](#594ce5f28b063eced4ee9b893e01a04c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/announcement/getTypes
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "anocmtTypeCode" : "string",
    "anocmtTypeId" : 0,
    "anocmtTypeName" : "string",
    "children" : [ {
      "anocmtTypeCode" : "string",
      "anocmtTypeId" : 0,
      "anocmtTypeName" : "string",
      "children" : [ "..." ]
    } ]
  } ],
  "message" : "string"
}
```


<a name="listusingget"></a>
#### 公告列表
```
GET /announcement/list
```


##### 参数

|类型|名称|说明|架构|默认列|
|---|---|---|---|---|
|**Query**|**limit**  <br>*可选*|limit|integer(int32)|`"10"`|
|**Query**|**page**  <br>*可选*|page|integer(int32)|`"1"`|
|**Query**|**pageType**  <br>*必填*|pageType|enum (APPLY, AUDIT)||


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«公告响应实体»](#0b341f2c86c4725b109bb6c80eb03de6)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/announcement/list
```


###### 请求 query
```
json :
{
  "limit" : 0,
  "page" : 0,
  "pageType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ {
      "anocmtContent" : "string",
      "anocmtSendTime" : 0,
      "anocmtTitle" : "string",
      "anocmtTypeId" : 0,
      "anocmtTypeName" : "string",
      "auditStatus" : 0,
      "channelId" : "string",
      "channelName" : "string",
      "createdTime" : 0,
      "id" : 0,
      "operId" : 0,
      "operName" : "string",
      "serverId" : "string",
      "updatedTime" : 0
    } ]
  },
  "message" : "string"
}
```


<a name="addusingpost_1"></a>
#### 新增CDK申请
```
POST /cdk/add
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|
|**Body**|**infoRequest**  <br>*必填*|infoRequest|[CdkAddRequest](#cdkaddrequest)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/cdk/add
```


###### 请求 header
```
json :
0
```


###### 请求 body
```
json :
{
  "awardProps" : "string",
  "cdkCount" : 0,
  "cdkMark" : "string",
  "cdkValidEndTime" : "string",
  "cdkValidStartTime" : "string",
  "channelId" : "string",
  "lowestUseLevel" : 0,
  "serverId" : "string",
  "useCountPerCdk" : 0,
  "useCountPerRole" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="auditandexportusingput"></a>
#### 礼包码导出或者拒绝
```
PUT /cdk/audit/{recordId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**recordId**  <br>*必填*|recordId|integer(int32)|
|**Query**|**auditStatus**  <br>*必填*|auditStatus|enum (INIT, PASS, REJECT)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«List«string»»](#46f466e1452253602c2411566f5003dc)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/cdk/audit/0
```


###### 请求 query
```
json :
{
  "auditStatus" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ "string" ],
  "message" : "string"
}
```


<a name="listusingget_1"></a>
#### CDK列表
```
GET /cdk/list
```


##### 参数

|类型|名称|说明|架构|默认列|
|---|---|---|---|---|
|**Query**|**limit**  <br>*可选*|limit|integer(int32)|`"10"`|
|**Query**|**page**  <br>*可选*|page|integer(int32)|`"1"`|
|**Query**|**pageType**  <br>*可选*|pageType|enum (APPLY, AUDIT)||


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«CDK响应实体»](#63c7b760b0c66868f090d4dfe0ee10e3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/cdk/list
```


###### 请求 query
```
json :
{
  "limit" : 0,
  "page" : 0,
  "pageType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ {
      "auditStatus" : 0,
      "awardProps" : "string",
      "cdkCount" : 0,
      "cdkMark" : "string",
      "cdkValidEndTime" : 0,
      "cdkValidStartTime" : 0,
      "channelId" : "string",
      "channelName" : "string",
      "createdTime" : 0,
      "id" : 0,
      "lowestUseLevel" : 0,
      "operId" : 0,
      "operName" : "string",
      "serverId" : "string",
      "updatedTime" : 0,
      "useCountPerCdk" : 0,
      "useCountPerRole" : 0
    } ]
  },
  "message" : "string"
}
```


<a name="addusingpost_2"></a>
#### 新增邮件申请
```
POST /email/add
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|
|**Body**|**addRequest**  <br>*必填*|addRequest|[EmailInfoAddRequest](#emailinfoaddrequest)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/email/add
```


###### 请求 header
```
json :
0
```


###### 请求 body
```
json :
{
  "awardProps" : "string",
  "channelId" : "string",
  "emailContent" : "string",
  "emailTitle" : "string",
  "emailType" : "string",
  "playerId" : "string",
  "serverId" : [ "string" ]
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="auditusingput_1"></a>
#### 邮件审批
```
PUT /email/audit/{recordId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**recordId**  <br>*必填*|recordId|integer(int32)|
|**Query**|**auditStatus**  <br>*必填*|auditStatus|enum (INIT, PASS, REJECT)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/email/audit/0
```


###### 请求 query
```
json :
{
  "auditStatus" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="listusingget_2"></a>
#### 邮件列表
```
GET /email/list
```


##### 参数

|类型|名称|说明|架构|默认列|
|---|---|---|---|---|
|**Query**|**emailType**  <br>*必填*|emailType|enum (ALL, GROUP, PERSONAL)||
|**Query**|**limit**  <br>*可选*|limit|integer(int32)|`"10"`|
|**Query**|**page**  <br>*可选*|page|integer(int32)|`"1"`|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«邮件响应体»](#81c9c8a8b460621c7a1f78d0858bc07a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/email/list
```


###### 请求 query
```
json :
{
  "emailType" : "string",
  "limit" : 0,
  "page" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ {
      "auditStatus" : 0,
      "awardProps" : "string",
      "channelId" : "string",
      "channelName" : "string",
      "createdTime" : 0,
      "emailContent" : "string",
      "emailTitle" : "string",
      "emailType" : 0,
      "id" : 0,
      "operId" : 0,
      "operName" : "string",
      "playerId" : "string",
      "serverId" : [ "string" ],
      "updatedTime" : 0
    } ]
  },
  "message" : "string"
}
```


<a name="getgameserverlistusingget"></a>
#### 获取服务器列表
```
GET /gameConfig/server
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Query**|**channelId**  <br>*必填*|channelId|string|
|**Query**|**gameId**  <br>*必填*|gameId|string|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«List«GameServerResponse»»](#e0d21e58f852f70b60a4fac89365ba5a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/gameConfig/server
```


###### 请求 query
```
json :
{
  "channelId" : "string",
  "gameId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "serverId" : "string",
    "serverName" : "string"
  } ],
  "message" : "string"
}
```


<a name="getchannelidsv2usingget"></a>
#### 获取具有权限的渠道
```
GET /gameConfig/v2/channelIds
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«List«渠道实体»»](#c5cd016f5d23e94f75f23f87ee1aee19)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/gameConfig/v2/channelIds
```


###### 请求 header
```
json :
0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "channelCode" : "string",
    "channelId" : "string"
  } ],
  "message" : "string"
}
```


<a name="addusingpost_4"></a>
#### 新增gs充值申请
```
POST /gsRecharge/add
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|
|**Body**|**infoRequest**  <br>*必填*|infoRequest|[GsRechargeInfoAddRequest](#gsrechargeinfoaddrequest)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/gsRecharge/add
```


###### 请求 header
```
json :
0
```


###### 请求 body
```
json :
{
  "cdkLevel" : "string",
  "channelId" : "string",
  "playerId" : "string",
  "rechargeReason" : "string",
  "serverId" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="auditusingput_2"></a>
#### GS充值审批
```
PUT /gsRecharge/audit/{recordId}
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Path**|**recordId**  <br>*必填*|recordId|integer(int32)|
|**Query**|**auditStatus**  <br>*必填*|auditStatus|enum (INIT, PASS, REJECT)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«SingleResponse«boolean»»](#5c58ce59780a216c9f7554b0c1fb5a5e)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/gsRecharge/audit/0
```


###### 请求 query
```
json :
{
  "auditStatus" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "rt" : true
  },
  "message" : "string"
}
```


<a name="listusingget_4"></a>
#### GS充值列表
```
GET /gsRecharge/list
```


##### 参数

|类型|名称|说明|架构|默认列|
|---|---|---|---|---|
|**Query**|**limit**  <br>*可选*|limit|integer(int32)|`"10"`|
|**Query**|**page**  <br>*可选*|page|integer(int32)|`"1"`|
|**Query**|**pageType**  <br>*可选*|pageType|enum (APPLY, AUDIT)||


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«GS充值响应实体»](#7e063fcf228b61d9423497466a965c11)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/gsRecharge/list
```


###### 请求 query
```
json :
{
  "limit" : 0,
  "page" : 0,
  "pageType" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "count" : 0,
    "data" : [ {
      "auditStatus" : 0,
      "cdkLevel" : "string",
      "channelId" : "string",
      "channelName" : "string",
      "createdTime" : 0,
      "id" : 0,
      "operId" : 0,
      "operName" : "string",
      "playerId" : "string",
      "rechargeReason" : "string",
      "serverId" : "string",
      "updatedTime" : 0
    } ]
  },
  "message" : "string"
}
```


<a name="profileusingget"></a>
#### 获取个人信息
```
GET /profile
```


##### 参数

|类型|名称|说明|架构|
|---|---|---|---|
|**Header**|**uid**  <br>*必填*|uid|integer(int32)|


##### 响应

|HTTP代码|说明|架构|
|---|---|---|
|**200**|OK|[ResponseDto«UserPermissionsDto»](#44799ce242d999c580a7f2e05b6b4553)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### 安全

|类型|名称|作用域|
|---|---|---|
|**未知**|**[uid](#uid)**|global|
|**未知**|**[token](#token)**|global|


##### HTTP请求示例

###### 请求 path
```
/profile
```


###### 请求 header
```
json :
0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "buttons" : [ "string" ],
    "channels" : [ "string" ],
    "menus" : [ "string" ],
    "sysUser" : {
      "avatar" : "string",
      "createdTime" : 0,
      "email" : "string",
      "id" : 0,
      "operId" : 0,
      "phone" : "string",
      "remark" : "string",
      "roleId" : 0,
      "status" : 0,
      "updatedTime" : 0,
      "userCode" : "string",
      "userName" : "string"
    }
  },
  "message" : "string"
}
```




<a name="definitions"></a>
## 定义

<a name="actionbygroupcoderesponse"></a>
### ActionByGroupCodeResponse

|名称|说明|架构|
|---|---|---|
|**actions**  <br>*可选*|**例子** : `[ "string" ]`|< string > array|
|**groupCode**  <br>*可选*|**例子** : `"string"`|string|
|**groupName**  <br>*可选*|**例子** : `"string"`|string|


<a name="announcementinfoaddrequest"></a>
### AnnouncementInfoAddRequest

|名称|说明|架构|
|---|---|---|
|**anocmtContent**  <br>*可选*|**例子** : `"string"`|string|
|**anocmtSendTime**  <br>*可选*|**例子** : `"string"`|string(date-time)|
|**anocmtTitle**  <br>*可选*|**例子** : `"string"`|string|
|**anocmtTypeId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|


<a name="announcementtyperesponse"></a>
### AnnouncementTypeResponse

|名称|说明|架构|
|---|---|---|
|**anocmtTypeCode**  <br>*可选*|**例子** : `"string"`|string|
|**anocmtTypeId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**anocmtTypeName**  <br>*可选*|**例子** : `"string"`|string|
|**children**  <br>*可选*|**例子** : `[ "[announcementtyperesponse](#announcementtyperesponse)" ]`|< [AnnouncementTypeResponse](#announcementtyperesponse) > array|


<a name="babdce47af1497d798384067c3473ac2"></a>
### CDK响应实体

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**data**  <br>*可选*|**例子** : `[ "[7eb9d79caede1a0c1c2e3dac26fc57fc](#7eb9d79caede1a0c1c2e3dac26fc57fc)" ]`|< [CDK对象](#7eb9d79caede1a0c1c2e3dac26fc57fc) > array|


<a name="7eb9d79caede1a0c1c2e3dac26fc57fc"></a>
### CDK对象

|名称|说明|架构|
|---|---|---|
|**auditStatus**  <br>*可选*|**例子** : `0`|integer(int32)|
|**awardProps**  <br>*可选*|**例子** : `"string"`|string|
|**cdkCount**  <br>*可选*|**例子** : `0`|integer(int32)|
|**cdkMark**  <br>*可选*|**例子** : `"string"`|string|
|**cdkValidEndTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**cdkValidStartTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**channelName**  <br>*可选*|**例子** : `"string"`|string|
|**createdTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**id**  <br>*可选*|**例子** : `0`|integer(int32)|
|**lowestUseLevel**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operName**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|
|**updatedTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**useCountPerCdk**  <br>*可选*|**例子** : `0`|integer(int32)|
|**useCountPerRole**  <br>*可选*|**例子** : `0`|integer(int32)|


<a name="cdkaddrequest"></a>
### CdkAddRequest

|名称|说明|架构|
|---|---|---|
|**awardProps**  <br>*可选*|**例子** : `"string"`|string|
|**cdkCount**  <br>*可选*|**例子** : `0`|integer(int32)|
|**cdkMark**  <br>*可选*|**例子** : `"string"`|string|
|**cdkValidEndTime**  <br>*可选*|**例子** : `"string"`|string(date-time)|
|**cdkValidStartTime**  <br>*可选*|**例子** : `"string"`|string(date-time)|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**lowestUseLevel**  <br>*可选*|**例子** : `0`|integer(int32)|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|
|**useCountPerCdk**  <br>*可选*|**例子** : `0`|integer(int32)|
|**useCountPerRole**  <br>*可选*|**例子** : `0`|integer(int32)|


<a name="data"></a>
### Data

|名称|说明|架构|
|---|---|---|
|**detail**  <br>*可选*|**例子** : `"object"`|object|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**playerName**  <br>*可选*|**例子** : `"string"`|string|
|**rankId**  <br>*可选*|**例子** : `0`|integer(int32)|


<a name="emailinfoaddrequest"></a>
### EmailInfoAddRequest

|名称|说明|架构|
|---|---|---|
|**awardProps**  <br>*可选*|获得奖励 格式: GSID\|12/GSID\|100  <br>**例子** : `"string"`|string|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**emailContent**  <br>*可选*|**例子** : `"string"`|string|
|**emailTitle**  <br>*可选*|**例子** : `"string"`|string|
|**emailType**  <br>*可选*|邮件类型  <br>**例子** : `"string"`|enum (ALL, GROUP, PERSONAL)|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|区服列表  <br>**例子** : `[ "string" ]`|< string > array|


<a name="externalexecuteparamsrequest"></a>
### ExternalExecuteParamsRequest

|名称|说明|架构|
|---|---|---|
|**params**  <br>*可选*|**例子** : `{<br>  "string" : "string"<br>}`|< string, string > map|
|**serviceCode**  <br>*可选*|**例子** : `"string"`|string|


<a name="externalservicecall"></a>
### ExternalServiceCall

|名称|说明|架构|
|---|---|---|
|**createdTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**id**  <br>*可选*|**例子** : `0`|integer(int32)|
|**method**  <br>*可选*|**例子** : `"string"`|string|
|**params**  <br>*可选*|**例子** : `"string"`|string|
|**remark**  <br>*可选*|**例子** : `"string"`|string|
|**serviceCode**  <br>*可选*|**例子** : `"string"`|string|
|**serviceName**  <br>*可选*|**例子** : `"string"`|string|
|**status**  <br>*可选*|**例子** : `0`|integer(int32)|
|**updatedTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**url**  <br>*可选*|**例子** : `"string"`|string|


<a name="externalservicecallpageresponse"></a>
### ExternalServiceCallPageResponse

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**externalServiceCalls**  <br>*可选*|**例子** : `[ "[externalservicecall](#externalservicecall)" ]`|< [ExternalServiceCall](#externalservicecall) > array|


<a name="20e5a3934cae3b475e9dcf5aee3a2b2e"></a>
### GS充值响应实体

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**data**  <br>*可选*|**例子** : `[ "[6445e9ccaeb91307924ff804b6452373](#6445e9ccaeb91307924ff804b6452373)" ]`|< [GS充值对象](#6445e9ccaeb91307924ff804b6452373) > array|


<a name="6445e9ccaeb91307924ff804b6452373"></a>
### GS充值对象

|名称|说明|架构|
|---|---|---|
|**auditStatus**  <br>*可选*|**例子** : `0`|integer(int32)|
|**cdkLevel**  <br>*可选*|**例子** : `"string"`|string|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**channelName**  <br>*可选*|**例子** : `"string"`|string|
|**createdTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**id**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operName**  <br>*可选*|**例子** : `"string"`|string|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**rechargeReason**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|
|**updatedTime**  <br>*可选*|**例子** : `0`|integer(int32)|


<a name="gameeventsresponse"></a>
### GameEventsResponse

|名称|说明|架构|
|---|---|---|
|**actionCode**  <br>*可选*|**例子** : `"string"`|string|
|**actionName**  <br>*可选*|**例子** : `"string"`|string|


<a name="gameplayer"></a>
### GamePlayer

|名称|说明|架构|
|---|---|---|
|**allianceId**  <br>*可选*|**例子** : `"string"`|string|
|**avatar**  <br>*可选*|**例子** : `"string"`|string|
|**channelId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**currency**  <br>*可选*|**例子** : `0`|integer(int64)|
|**data**  <br>*可选*|**例子** : `{<br>  "string" : "string"<br>}`|< string, string > map|
|**disabledChat**  <br>*可选*|**例子** : `true`|boolean|
|**disabledLogin**  <br>*可选*|**例子** : `true`|boolean|
|**fighting**  <br>*可选*|**例子** : `0`|integer(int64)|
|**gameCurrency**  <br>*可选*|**例子** : `0`|integer(int64)|
|**level**  <br>*可选*|**例子** : `0`|integer(int32)|
|**nickname**  <br>*可选*|**例子** : `"string"`|string|
|**platformUserId**  <br>*可选*|**例子** : `"string"`|string|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**updateAt**  <br>*可选*|**例子** : `"string"`|string(date-time)|
|**vip**  <br>*可选*|**例子** : `0`|integer(int32)|


<a name="gameplayeraction"></a>
### GamePlayerAction

|名称|说明|架构|
|---|---|---|
|**action**  <br>*可选*|**例子** : `"string"`|string|
|**channelId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**createAt**  <br>*可选*|**例子** : `"string"`|string(date-time)|
|**currency**  <br>*可选*|**例子** : `0`|integer(int64)|
|**data**  <br>*可选*|**例子** : `"object"`|object|
|**gameCurrency**  <br>*可选*|**例子** : `0`|integer(int64)|
|**levelId**  <br>*可选*|**例子** : `"string"`|string|
|**obtainedProps**  <br>*可选*|**例子** : `[ "object" ]`|< object > array|
|**platform**  <br>*可选*|**最小值** : `-128`  <br>**最大值** : `127`**例子** : `0`|integer(int32)|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**remark**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**usedProps**  <br>*可选*|**例子** : `[ "object" ]`|< object > array|


<a name="gameserverresponse"></a>
### GameServerResponse

|名称|说明|架构|
|---|---|---|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|
|**serverName**  <br>*可选*|**例子** : `"string"`|string|


<a name="gsrechargeinfoaddrequest"></a>
### GsRechargeInfoAddRequest

|名称|说明|架构|
|---|---|---|
|**cdkLevel**  <br>*可选*|**例子** : `"string"`|string|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**rechargeReason**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|


<a name="loginrequest"></a>
### LoginRequest

|名称|说明|架构|
|---|---|---|
|**passwd**  <br>*可选*|**例子** : `"string"`|string|
|**userCode**  <br>*可选*|**例子** : `"string"`|string|


<a name="permisssionrequest"></a>
### PermisssionRequest

|名称|说明|架构|
|---|---|---|
|**permissions**  <br>*可选*|权限  <br>**例子** : `"[userpermissionsdto](#userpermissionsdto)"`|[UserPermissionsDto](#userpermissionsdto)|
|**roleId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**roleName**  <br>*可选*|**例子** : `"string"`|string|


<a name="playeractiongroup"></a>
### PlayerActionGroup

|名称|说明|架构|
|---|---|---|
|**action**  <br>*可选*|**例子** : `"string"`|string|
|**createdTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**groupCode**  <br>*可选*|**例子** : `"string"`|string|
|**groupName**  <br>*可选*|**例子** : `"string"`|string|
|**id**  <br>*可选*|**例子** : `0`|integer(int32)|
|**openStatistics**  <br>*可选*|**例子** : `0`|integer(int32)|
|**remark**  <br>*可选*|**例子** : `"string"`|string|
|**updatedTime**  <br>*可选*|**例子** : `0`|integer(int32)|


<a name="playeractiongrouppageresponse"></a>
### PlayerActionGroupPageResponse

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**groups**  <br>*可选*|**例子** : `[ "[playeractiongroup](#playeractiongroup)" ]`|< [PlayerActionGroup](#playeractiongroup) > array|


<a name="playeractionlog"></a>
### PlayerActionLog

|名称|说明|架构|
|---|---|---|
|**gamePlayer**  <br>*可选*|**例子** : `"[gameplayer](#gameplayer)"`|[GamePlayer](#gameplayer)|
|**lastPage**  <br>*可选*|**例子** : `true`|boolean|
|**pagingState**  <br>*可选*|**例子** : `"string"`|string|
|**playerActions**  <br>*可选*|**例子** : `[ "[gameplayeraction](#gameplayeraction)" ]`|< [GamePlayerAction](#gameplayeraction) > array|


<a name="playerinfo"></a>
### PlayerInfo

|名称|说明|架构|
|---|---|---|
|**lastPage**  <br>*可选*|**例子** : `true`|boolean|
|**pagingState**  <br>*可选*|**例子** : `"string"`|string|
|**players**  <br>*可选*|**例子** : `[ "[gameplayer](#gameplayer)" ]`|< [GamePlayer](#gameplayer) > array|


<a name="ranklist"></a>
### RankList

|名称|说明|架构|
|---|---|---|
|**data**  <br>*可选*|**例子** : `[ "[data](#data)" ]`|< [Data](#data) > array|
|**type**  <br>*可选*|**例子** : `"string"`|string|


<a name="63c7b760b0c66868f090d4dfe0ee10e3"></a>
### ResponseDto«CDK响应实体»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[babdce47af1497d798384067c3473ac2](#babdce47af1497d798384067c3473ac2)"`|[CDK响应实体](#babdce47af1497d798384067c3473ac2)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="f316079da3e5b0b005ccba71e910615e"></a>
### ResponseDto«ExternalServiceCallPageResponse»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[externalservicecallpageresponse](#externalservicecallpageresponse)"`|[ExternalServiceCallPageResponse](#externalservicecallpageresponse)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="7e063fcf228b61d9423497466a965c11"></a>
### ResponseDto«GS充值响应实体»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[20e5a3934cae3b475e9dcf5aee3a2b2e](#20e5a3934cae3b475e9dcf5aee3a2b2e)"`|[GS充值响应实体](#20e5a3934cae3b475e9dcf5aee3a2b2e)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="012f34b6bf5340a1df785577664b4aeb"></a>
### ResponseDto«List«ActionByGroupCodeResponse»»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `[ "[actionbygroupcoderesponse](#actionbygroupcoderesponse)" ]`|< [ActionByGroupCodeResponse](#actionbygroupcoderesponse) > array|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="594ce5f28b063eced4ee9b893e01a04c"></a>
### ResponseDto«List«AnnouncementTypeResponse»»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `[ "[announcementtyperesponse](#announcementtyperesponse)" ]`|< [AnnouncementTypeResponse](#announcementtyperesponse) > array|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="5fe912824eb35e6fc60e0f4eb9f65b42"></a>
### ResponseDto«List«GameEventsResponse»»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `[ "[gameeventsresponse](#gameeventsresponse)" ]`|< [GameEventsResponse](#gameeventsresponse) > array|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="e0d21e58f852f70b60a4fac89365ba5a"></a>
### ResponseDto«List«GameServerResponse»»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `[ "[gameserverresponse](#gameserverresponse)" ]`|< [GameServerResponse](#gameserverresponse) > array|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="27da09df06d0c59a4b5a85f4eda43da8"></a>
### ResponseDto«List«RankList»»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `[ "[ranklist](#ranklist)" ]`|< [RankList](#ranklist) > array|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="46f466e1452253602c2411566f5003dc"></a>
### ResponseDto«List«string»»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `[ "string" ]`|< string > array|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="c5cd016f5d23e94f75f23f87ee1aee19"></a>
### ResponseDto«List«渠道实体»»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `[ "[607f1ee80d9a8f662925d08ebbfd3f12](#607f1ee80d9a8f662925d08ebbfd3f12)" ]`|< [渠道实体](#607f1ee80d9a8f662925d08ebbfd3f12) > array|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="867872e9dc16ba5b1f2c3f10d8415f7c"></a>
### ResponseDto«PlayerActionGroupPageResponse»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[playeractiongrouppageresponse](#playeractiongrouppageresponse)"`|[PlayerActionGroupPageResponse](#playeractiongrouppageresponse)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="4a015fa0b3b45341394fc5a4c822eba9"></a>
### ResponseDto«PlayerActionLog»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[playeractionlog](#playeractionlog)"`|[PlayerActionLog](#playeractionlog)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="68ac8bece28b1d11d87d227567090108"></a>
### ResponseDto«PlayerInfo»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[playerinfo](#playerinfo)"`|[PlayerInfo](#playerinfo)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="7f61807d91de8675c6469b03926d62a4"></a>
### ResponseDto«RolePermissionResponse»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[rolepermissionresponse](#rolepermissionresponse)"`|[RolePermissionResponse](#rolepermissionresponse)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="aa0f699160d83482f4d8b6a2844868b1"></a>
### ResponseDto«RoleResponse»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[roleresponse](#roleresponse)"`|[RoleResponse](#roleresponse)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="5c58ce59780a216c9f7554b0c1fb5a5e"></a>
### ResponseDto«SingleResponse«boolean»»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[e8508684ed6d258c09658565e312a147](#e8508684ed6d258c09658565e312a147)"`|[SingleResponse«boolean»](#e8508684ed6d258c09658565e312a147)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="83cc6adcf22012ee86d8f649a295cba2"></a>
### ResponseDto«SingleResponse»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[singleresponse](#singleresponse)"`|[SingleResponse](#singleresponse)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="045c4a3ce2809e1de1ade23cc54aa2f2"></a>
### ResponseDto«StatisticsResponse»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[statisticsresponse](#statisticsresponse)"`|[StatisticsResponse](#statisticsresponse)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="6166917bdbfa36cd1ed7fe340bf2fa4a"></a>
### ResponseDto«SysUserLoginResponse»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[sysuserloginresponse](#sysuserloginresponse)"`|[SysUserLoginResponse](#sysuserloginresponse)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="9d9dcee3da56bf895740850bb30896c4"></a>
### ResponseDto«SysUserPageResponse»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[sysuserpageresponse](#sysuserpageresponse)"`|[SysUserPageResponse](#sysuserpageresponse)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="44799ce242d999c580a7f2e05b6b4553"></a>
### ResponseDto«UserPermissionsDto»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[userpermissionsdto](#userpermissionsdto)"`|[UserPermissionsDto](#userpermissionsdto)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="0b341f2c86c4725b109bb6c80eb03de6"></a>
### ResponseDto«公告响应实体»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[c05d08983e8923194c11ca1372ff1764](#c05d08983e8923194c11ca1372ff1764)"`|[公告响应实体](#c05d08983e8923194c11ca1372ff1764)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="b18e450e32a6088306cb8c919ff3ff6e"></a>
### ResponseDto«游戏id实体»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[5cdb562685f6dd4ecf98606bda568b3d](#5cdb562685f6dd4ecf98606bda568b3d)"`|[游戏id实体](#5cdb562685f6dd4ecf98606bda568b3d)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="81c9c8a8b460621c7a1f78d0858bc07a"></a>
### ResponseDto«邮件响应体»

|名称|说明|架构|
|---|---|---|
|**code**  <br>*可选*|**例子** : `0`|integer(int32)|
|**data**  <br>*可选*|**例子** : `"[e69a2ef61e49c3bb3a45f6c79ab4d337](#e69a2ef61e49c3bb3a45f6c79ab4d337)"`|[邮件响应体](#e69a2ef61e49c3bb3a45f6c79ab4d337)|
|**message**  <br>*可选*|**例子** : `"string"`|string|


<a name="rolepermissionresponse"></a>
### RolePermissionResponse

|名称|说明|架构|
|---|---|---|
|**permissions**  <br>*可选*|权限信息  <br>**例子** : `"[userpermissionsdto](#userpermissionsdto)"`|[UserPermissionsDto](#userpermissionsdto)|
|**roleInfo**  <br>*可选*|角色信息  <br>**例子** : `"[sysrole](#sysrole)"`|[SysRole](#sysrole)|


<a name="roleresponse"></a>
### RoleResponse

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**sysRoles**  <br>*可选*|**例子** : `[ "[sysrole](#sysrole)" ]`|< [SysRole](#sysrole) > array|


<a name="singleresponse"></a>
### SingleResponse

|名称|说明|架构|
|---|---|---|
|**rt**  <br>*可选*|**例子** : `"object"`|object|


<a name="e8508684ed6d258c09658565e312a147"></a>
### SingleResponse«boolean»

|名称|说明|架构|
|---|---|---|
|**rt**  <br>*可选*|**例子** : `true`|boolean|


<a name="statisticsresponse"></a>
### StatisticsResponse

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**data**  <br>*可选*|**例子** : `[ "object" ]`|< object > array|


<a name="sysrole"></a>
### SysRole

|名称|说明|架构|
|---|---|---|
|**createdTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**roleId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**roleName**  <br>*可选*|**例子** : `"string"`|string|
|**status**  <br>*可选*|**例子** : `0`|integer(int32)|
|**updatedTime**  <br>*可选*|**例子** : `0`|integer(int32)|


<a name="sysuser"></a>
### SysUser

|名称|说明|架构|
|---|---|---|
|**avatar**  <br>*可选*|**例子** : `"string"`|string|
|**createdTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**email**  <br>*可选*|**例子** : `"string"`|string|
|**id**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**phone**  <br>*可选*|**例子** : `"string"`|string|
|**remark**  <br>*可选*|**例子** : `"string"`|string|
|**roleId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**status**  <br>*可选*|**例子** : `0`|integer(int32)|
|**updatedTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**userCode**  <br>*可选*|**例子** : `"string"`|string|
|**userName**  <br>*可选*|**例子** : `"string"`|string|


<a name="sysuserloginresponse"></a>
### SysUserLoginResponse

|名称|说明|架构|
|---|---|---|
|**avatar**  <br>*可选*|**例子** : `"string"`|string|
|**email**  <br>*可选*|**例子** : `"string"`|string|
|**id**  <br>*可选*|**例子** : `0`|integer(int32)|
|**phone**  <br>*可选*|**例子** : `"string"`|string|
|**remark**  <br>*可选*|**例子** : `"string"`|string|
|**token**  <br>*可选*|**例子** : `"string"`|string|
|**userCode**  <br>*可选*|**例子** : `"string"`|string|
|**userName**  <br>*可选*|**例子** : `"string"`|string|


<a name="sysuserpageresponse"></a>
### SysUserPageResponse

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**sysUsers**  <br>*可选*|**例子** : `[ "[sysuser](#sysuser)" ]`|< [SysUser](#sysuser) > array|


<a name="userpermissionsdto"></a>
### UserPermissionsDto

|名称|说明|架构|
|---|---|---|
|**buttons**  <br>*可选*|**例子** : `[ "string" ]`|< string > array|
|**channels**  <br>*可选*|**例子** : `[ "string" ]`|< string > array|
|**menus**  <br>*可选*|**例子** : `[ "string" ]`|< string > array|
|**sysUser**  <br>*可选*|**例子** : `"[sysuser](#sysuser)"`|[SysUser](#sysuser)|


<a name="8d144b1924cfa508bdb258c6a6671514"></a>
### 修改组对象

|名称|说明|架构|
|---|---|---|
|**actions**  <br>*可选*|**例子** : `[ "string" ]`|< string > array|
|**groupName**  <br>*可选*|**例子** : `"string"`|string|
|**openStatistics**  <br>*可选*|**例子** : `"string"`|enum (CLOSE, OPEN)|
|**remark**  <br>*可选*|**例子** : `"string"`|string|


<a name="c05d08983e8923194c11ca1372ff1764"></a>
### 公告响应实体

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**data**  <br>*可选*|**例子** : `[ "[fdd03928a72c88de11bf94a5a4af1ec7](#fdd03928a72c88de11bf94a5a4af1ec7)" ]`|< [公告对象](#fdd03928a72c88de11bf94a5a4af1ec7) > array|


<a name="fdd03928a72c88de11bf94a5a4af1ec7"></a>
### 公告对象

|名称|说明|架构|
|---|---|---|
|**anocmtContent**  <br>*可选*|**例子** : `"string"`|string|
|**anocmtSendTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**anocmtTitle**  <br>*可选*|**例子** : `"string"`|string|
|**anocmtTypeId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**anocmtTypeName**  <br>*可选*|**例子** : `"string"`|string|
|**auditStatus**  <br>*可选*|**例子** : `0`|integer(int32)|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**channelName**  <br>*可选*|**例子** : `"string"`|string|
|**createdTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**id**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operName**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|
|**updatedTime**  <br>*可选*|**例子** : `0`|integer(int32)|


<a name="a02fa58bc4d7008b2fdc0aed70ca0193"></a>
### 外部服务调用实体

|名称|说明|架构|
|---|---|---|
|**method**  <br>*可选*|**例子** : `"string"`|string|
|**params**  <br>*可选*|**例子** : `"string"`|string|
|**remark**  <br>*可选*|**例子** : `"string"`|string|
|**serviceName**  <br>*可选*|**例子** : `"string"`|string|
|**url**  <br>*可选*|**例子** : `"string"`|string|


<a name="ee7742115341fb13a60dcd754acbcf00"></a>
### 新增组对象

|名称|说明|架构|
|---|---|---|
|**actions**  <br>*可选*|**例子** : `[ "string" ]`|< string > array|
|**groupCode**  <br>*可选*|**例子** : `"string"`|string|
|**groupName**  <br>*可选*|**例子** : `"string"`|string|
|**openStatistics**  <br>*可选*|是否开放统计接口  <br>**例子** : `"string"`|enum (CLOSE, OPEN)|
|**remark**  <br>*可选*|**例子** : `"string"`|string|


<a name="607f1ee80d9a8f662925d08ebbfd3f12"></a>
### 渠道实体

|名称|说明|架构|
|---|---|---|
|**channelCode**  <br>*可选*|**例子** : `"string"`|string|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|


<a name="5cdb562685f6dd4ecf98606bda568b3d"></a>
### 游戏id实体

|名称|说明|架构|
|---|---|---|
|**gameId**  <br>*可选*|**例子** : `"string"`|string|


<a name="3c1b83e0989333ad9395249ea2fd71f8"></a>
### 玩家个人信息查询

|名称|说明|架构|
|---|---|---|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**pageSize**  <br>*可选*|**例子** : `0`|integer(int32)|
|**pagingState**  <br>*可选*|**例子** : `"string"`|string|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**playerName**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|


<a name="edca7e2c54012bd148517e667aa208fb"></a>
### 玩家行为日志查询

|名称|说明|架构|
|---|---|---|
|**beginTime**  <br>*可选*|**例子** : `"string"`|string(date-time)|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**defaultTimeFlag**  <br>*可选*|**例子** : `true`|boolean|
|**endTime**  <br>*可选*|**例子** : `"string"`|string(date-time)|
|**groupCode**  <br>*可选*|**例子** : `"string"`|string|
|**pageSize**  <br>*可选*|**例子** : `0`|integer(int32)|
|**pagingState**  <br>*可选*|**例子** : `"string"`|string|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**playerName**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `"string"`|string|


<a name="bc683849faf584b794d3e1f362015a3c"></a>
### 用户请求修改实体

|名称|说明|架构|
|---|---|---|
|**avatar**  <br>*可选*|**例子** : `"string"`|string|
|**email**  <br>*可选*|**例子** : `"string"`|string|
|**passwd**  <br>*可选*|**例子** : `"string"`|string|
|**phone**  <br>*可选*|**例子** : `"string"`|string|
|**remark**  <br>*可选*|**例子** : `"string"`|string|
|**userName**  <br>*可选*|**例子** : `"string"`|string|


<a name="79849b8d98f8ae0eabf3fad8a3b050ae"></a>
### 用户请求实体

|名称|说明|架构|
|---|---|---|
|**avatar**  <br>*可选*|**例子** : `"string"`|string|
|**email**  <br>*可选*|**例子** : `"string"`|string|
|**passwd**  <br>*可选*|**例子** : `"string"`|string|
|**phone**  <br>*可选*|**例子** : `"string"`|string|
|**remark**  <br>*可选*|**例子** : `"string"`|string|
|**roleId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**userCode**  <br>*可选*|**例子** : `"string"`|string|
|**userName**  <br>*可选*|**例子** : `"string"`|string|


<a name="e69a2ef61e49c3bb3a45f6c79ab4d337"></a>
### 邮件响应体

|名称|说明|架构|
|---|---|---|
|**count**  <br>*可选*|**例子** : `0`|integer(int64)|
|**data**  <br>*可选*|**例子** : `[ "[65091a5b5249723bdbcf83701fcb6c8a](#65091a5b5249723bdbcf83701fcb6c8a)" ]`|< [邮件对象](#65091a5b5249723bdbcf83701fcb6c8a) > array|


<a name="65091a5b5249723bdbcf83701fcb6c8a"></a>
### 邮件对象

|名称|说明|架构|
|---|---|---|
|**auditStatus**  <br>*可选*|**例子** : `0`|integer(int32)|
|**awardProps**  <br>*可选*|奖励  <br>**例子** : `"string"`|string|
|**channelId**  <br>*可选*|**例子** : `"string"`|string|
|**channelName**  <br>*可选*|**例子** : `"string"`|string|
|**createdTime**  <br>*可选*|**例子** : `0`|integer(int32)|
|**emailContent**  <br>*可选*|**例子** : `"string"`|string|
|**emailTitle**  <br>*可选*|**例子** : `"string"`|string|
|**emailType**  <br>*可选*|**例子** : `0`|integer(int32)|
|**id**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operId**  <br>*可选*|**例子** : `0`|integer(int32)|
|**operName**  <br>*可选*|**例子** : `"string"`|string|
|**playerId**  <br>*可选*|**例子** : `"string"`|string|
|**serverId**  <br>*可选*|**例子** : `[ "string" ]`|< string > array|
|**updatedTime**  <br>*可选*|**例子** : `0`|integer(int32)|





