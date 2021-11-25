// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetOuterCallCenterDataListRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("FromPhoneNum")
    public String fromPhoneNum;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueryEndTime")
    public String queryEndTime;

    @NameInMap("QueryStartTime")
    public String queryStartTime;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("ToPhoneNum")
    public String toPhoneNum;

    public static GetOuterCallCenterDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOuterCallCenterDataListRequest self = new GetOuterCallCenterDataListRequest();
        return TeaModel.build(map, self);
    }

    public GetOuterCallCenterDataListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetOuterCallCenterDataListRequest setFromPhoneNum(String fromPhoneNum) {
        this.fromPhoneNum = fromPhoneNum;
        return this;
    }
    public String getFromPhoneNum() {
        return this.fromPhoneNum;
    }

    public GetOuterCallCenterDataListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetOuterCallCenterDataListRequest setQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }
    public String getQueryEndTime() {
        return this.queryEndTime;
    }

    public GetOuterCallCenterDataListRequest setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }
    public String getQueryStartTime() {
        return this.queryStartTime;
    }

    public GetOuterCallCenterDataListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetOuterCallCenterDataListRequest setToPhoneNum(String toPhoneNum) {
        this.toPhoneNum = toPhoneNum;
        return this;
    }
    public String getToPhoneNum() {
        return this.toPhoneNum;
    }

}
