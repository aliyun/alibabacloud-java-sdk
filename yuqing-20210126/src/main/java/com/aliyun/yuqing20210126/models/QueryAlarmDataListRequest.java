// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAlarmDataListRequest extends TeaModel {
    @NameInMap("alarmQuery")
    public AlarmQueryCondition alarmQuery;

    // 排序方式
    @NameInMap("orderByKey")
    public String orderByKey;

    // 舆情团队HashId
    @NameInMap("teamHashId")
    public String teamHashId;

    // 请求id
    @NameInMap("requestId")
    public String requestId;

    public static QueryAlarmDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmDataListRequest self = new QueryAlarmDataListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlarmDataListRequest setAlarmQuery(AlarmQueryCondition alarmQuery) {
        this.alarmQuery = alarmQuery;
        return this;
    }
    public AlarmQueryCondition getAlarmQuery() {
        return this.alarmQuery;
    }

    public QueryAlarmDataListRequest setOrderByKey(String orderByKey) {
        this.orderByKey = orderByKey;
        return this;
    }
    public String getOrderByKey() {
        return this.orderByKey;
    }

    public QueryAlarmDataListRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

    public QueryAlarmDataListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
