// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SendMessageToUserRequest extends TeaModel {
    @NameInMap("ReceiverNickName")
    public String receiverNickName;

    @NameInMap("SenderNickName")
    public String senderNickName;

    @NameInMap("TemplateData")
    public java.util.Map<String, ?> templateData;

    @NameInMap("TemplateId")
    public String templateId;

    public static SendMessageToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToUserRequest self = new SendMessageToUserRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToUserRequest setReceiverNickName(String receiverNickName) {
        this.receiverNickName = receiverNickName;
        return this;
    }
    public String getReceiverNickName() {
        return this.receiverNickName;
    }

    public SendMessageToUserRequest setSenderNickName(String senderNickName) {
        this.senderNickName = senderNickName;
        return this;
    }
    public String getSenderNickName() {
        return this.senderNickName;
    }

    public SendMessageToUserRequest setTemplateData(java.util.Map<String, ?> templateData) {
        this.templateData = templateData;
        return this;
    }
    public java.util.Map<String, ?> getTemplateData() {
        return this.templateData;
    }

    public SendMessageToUserRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
