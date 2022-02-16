// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125.models;

import com.aliyun.tea.*;

public class SendBatchMessageRequest extends TeaModel {
    @NameInMap("BatchFlag")
    public String batchFlag;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    @NameInMap("SignNameJson")
    public String signNameJson;

    @NameInMap("SpecificChannel")
    public String specificChannel;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateParamJson")
    public String templateParamJson;

    public static SendBatchMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBatchMessageRequest self = new SendBatchMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendBatchMessageRequest setBatchFlag(String batchFlag) {
        this.batchFlag = batchFlag;
        return this;
    }
    public String getBatchFlag() {
        return this.batchFlag;
    }

    public SendBatchMessageRequest setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public SendBatchMessageRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public SendBatchMessageRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public SendBatchMessageRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

    public SendBatchMessageRequest setSpecificChannel(String specificChannel) {
        this.specificChannel = specificChannel;
        return this;
    }
    public String getSpecificChannel() {
        return this.specificChannel;
    }

    public SendBatchMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendBatchMessageRequest setTemplateParamJson(String templateParamJson) {
        this.templateParamJson = templateParamJson;
        return this;
    }
    public String getTemplateParamJson() {
        return this.templateParamJson;
    }

}
