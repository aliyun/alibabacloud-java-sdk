// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class SendVerifyCodeRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Extend")
    public java.util.Map<String, ?> extend;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("MessageParameters")
    public java.util.Map<String, ?> messageParameters;

    @NameInMap("MessageReiver")
    public String messageReiver;

    @NameInMap("MteeCode")
    public String mteeCode;

    @NameInMap("RiskRequestId")
    public String riskRequestId;

    @NameInMap("TimeInterval")
    public Integer timeInterval;

    @NameInMap("UserId")
    public String userId;

    public static SendVerifyCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeRequest self = new SendVerifyCodeRequest();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SendVerifyCodeRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendVerifyCodeRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public SendVerifyCodeRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public SendVerifyCodeRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public SendVerifyCodeRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public SendVerifyCodeRequest setMessageParameters(java.util.Map<String, ?> messageParameters) {
        this.messageParameters = messageParameters;
        return this;
    }
    public java.util.Map<String, ?> getMessageParameters() {
        return this.messageParameters;
    }

    public SendVerifyCodeRequest setMessageReiver(String messageReiver) {
        this.messageReiver = messageReiver;
        return this;
    }
    public String getMessageReiver() {
        return this.messageReiver;
    }

    public SendVerifyCodeRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public SendVerifyCodeRequest setRiskRequestId(String riskRequestId) {
        this.riskRequestId = riskRequestId;
        return this;
    }
    public String getRiskRequestId() {
        return this.riskRequestId;
    }

    public SendVerifyCodeRequest setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public SendVerifyCodeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
