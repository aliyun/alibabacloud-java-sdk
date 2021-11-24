// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211124.models;

import com.aliyun.tea.*;

public class SendBatchMessageRequest extends TeaModel {
    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    @NameInMap("SignNameJson")
    public String signNameJson;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateParamJson")
    public String templateParamJson;

    public static SendBatchMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBatchMessageRequest self = new SendBatchMessageRequest();
        return TeaModel.build(map, self);
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
