// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class SendVerifyCodeShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("CodeType")
    public String codeType;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("Extend")
    public String extendShrink;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("MessageParameters")
    public String messageParametersShrink;

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

    public static SendVerifyCodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendVerifyCodeShrinkRequest self = new SendVerifyCodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendVerifyCodeShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SendVerifyCodeShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendVerifyCodeShrinkRequest setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public SendVerifyCodeShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public SendVerifyCodeShrinkRequest setExtendShrink(String extendShrink) {
        this.extendShrink = extendShrink;
        return this;
    }
    public String getExtendShrink() {
        return this.extendShrink;
    }

    public SendVerifyCodeShrinkRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public SendVerifyCodeShrinkRequest setMessageParametersShrink(String messageParametersShrink) {
        this.messageParametersShrink = messageParametersShrink;
        return this;
    }
    public String getMessageParametersShrink() {
        return this.messageParametersShrink;
    }

    public SendVerifyCodeShrinkRequest setMessageReiver(String messageReiver) {
        this.messageReiver = messageReiver;
        return this;
    }
    public String getMessageReiver() {
        return this.messageReiver;
    }

    public SendVerifyCodeShrinkRequest setMteeCode(String mteeCode) {
        this.mteeCode = mteeCode;
        return this;
    }
    public String getMteeCode() {
        return this.mteeCode;
    }

    public SendVerifyCodeShrinkRequest setRiskRequestId(String riskRequestId) {
        this.riskRequestId = riskRequestId;
        return this;
    }
    public String getRiskRequestId() {
        return this.riskRequestId;
    }

    public SendVerifyCodeShrinkRequest setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public SendVerifyCodeShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
