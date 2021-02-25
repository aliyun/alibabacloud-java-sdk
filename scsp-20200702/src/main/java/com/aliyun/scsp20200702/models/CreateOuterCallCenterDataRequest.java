// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateOuterCallCenterDataRequest extends TeaModel {
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("InterveneTime")
    public String interveneTime;

    @NameInMap("CallType")
    public String callType;

    @NameInMap("FromPhoneNum")
    public String fromPhoneNum;

    @NameInMap("ToPhoneNum")
    public String toPhoneNum;

    @NameInMap("EndReason")
    public String endReason;

    @NameInMap("UserInfo")
    public String userInfo;

    @NameInMap("RecordUrl")
    public String recordUrl;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateOuterCallCenterDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOuterCallCenterDataRequest self = new CreateOuterCallCenterDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateOuterCallCenterDataRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public CreateOuterCallCenterDataRequest setInterveneTime(String interveneTime) {
        this.interveneTime = interveneTime;
        return this;
    }
    public String getInterveneTime() {
        return this.interveneTime;
    }

    public CreateOuterCallCenterDataRequest setCallType(String callType) {
        this.callType = callType;
        return this;
    }
    public String getCallType() {
        return this.callType;
    }

    public CreateOuterCallCenterDataRequest setFromPhoneNum(String fromPhoneNum) {
        this.fromPhoneNum = fromPhoneNum;
        return this;
    }
    public String getFromPhoneNum() {
        return this.fromPhoneNum;
    }

    public CreateOuterCallCenterDataRequest setToPhoneNum(String toPhoneNum) {
        this.toPhoneNum = toPhoneNum;
        return this;
    }
    public String getToPhoneNum() {
        return this.toPhoneNum;
    }

    public CreateOuterCallCenterDataRequest setEndReason(String endReason) {
        this.endReason = endReason;
        return this;
    }
    public String getEndReason() {
        return this.endReason;
    }

    public CreateOuterCallCenterDataRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

    public CreateOuterCallCenterDataRequest setRecordUrl(String recordUrl) {
        this.recordUrl = recordUrl;
        return this;
    }
    public String getRecordUrl() {
        return this.recordUrl;
    }

    public CreateOuterCallCenterDataRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateOuterCallCenterDataRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateOuterCallCenterDataRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateOuterCallCenterDataRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateOuterCallCenterDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
