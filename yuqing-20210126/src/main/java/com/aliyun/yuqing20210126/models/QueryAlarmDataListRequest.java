// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class QueryAlarmDataListRequest extends TeaModel {
    @NameInMap("alarmQuery")
    public AlarmQueryCondition alarmQuery;

    @NameInMap("orderByKey")
    public String orderByKey;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("teamHashId")
    public String teamHashId;

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

    public QueryAlarmDataListRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlarmDataListRequest setTeamHashId(String teamHashId) {
        this.teamHashId = teamHashId;
        return this;
    }
    public String getTeamHashId() {
        return this.teamHashId;
    }

}
