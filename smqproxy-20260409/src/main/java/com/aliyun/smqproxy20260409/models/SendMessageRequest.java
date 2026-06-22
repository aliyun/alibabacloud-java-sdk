// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    @NameInMap("DelaySeconds")
    public Integer delaySeconds;

    @NameInMap("MessageBody")
    public String messageBody;

    @NameInMap("MessageGroupId")
    public String messageGroupId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("UserProperties")
    public String userProperties;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }
    public Integer getDelaySeconds() {
        return this.delaySeconds;
    }

    public SendMessageRequest setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

    public SendMessageRequest setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
        return this;
    }
    public String getMessageGroupId() {
        return this.messageGroupId;
    }

    public SendMessageRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public SendMessageRequest setUserProperties(String userProperties) {
        this.userProperties = userProperties;
        return this;
    }
    public String getUserProperties() {
        return this.userProperties;
    }

}
