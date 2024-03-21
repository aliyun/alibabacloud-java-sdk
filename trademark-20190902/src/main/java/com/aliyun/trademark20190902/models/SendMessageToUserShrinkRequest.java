// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SendMessageToUserShrinkRequest extends TeaModel {
    @NameInMap("ReceiverNickName")
    public String receiverNickName;

    @NameInMap("SenderNickName")
    public String senderNickName;

    @NameInMap("TemplateData")
    public String templateDataShrink;

    @NameInMap("TemplateId")
    public String templateId;

    public static SendMessageToUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToUserShrinkRequest self = new SendMessageToUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToUserShrinkRequest setReceiverNickName(String receiverNickName) {
        this.receiverNickName = receiverNickName;
        return this;
    }
    public String getReceiverNickName() {
        return this.receiverNickName;
    }

    public SendMessageToUserShrinkRequest setSenderNickName(String senderNickName) {
        this.senderNickName = senderNickName;
        return this;
    }
    public String getSenderNickName() {
        return this.senderNickName;
    }

    public SendMessageToUserShrinkRequest setTemplateDataShrink(String templateDataShrink) {
        this.templateDataShrink = templateDataShrink;
        return this;
    }
    public String getTemplateDataShrink() {
        return this.templateDataShrink;
    }

    public SendMessageToUserShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
