// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sms_intl20180501.models;

import com.aliyun.tea.*;

public class SendMessageWithTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("To")
    public String to;

    @NameInMap("From")
    public String from;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateParam")
    public String templateParam;

    @NameInMap("SmsUpExtendCode")
    public String smsUpExtendCode;

    public static SendMessageWithTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageWithTemplateRequest self = new SendMessageWithTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageWithTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SendMessageWithTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SendMessageWithTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SendMessageWithTemplateRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public SendMessageWithTemplateRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendMessageWithTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendMessageWithTemplateRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendMessageWithTemplateRequest setSmsUpExtendCode(String smsUpExtendCode) {
        this.smsUpExtendCode = smsUpExtendCode;
        return this;
    }
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

}
