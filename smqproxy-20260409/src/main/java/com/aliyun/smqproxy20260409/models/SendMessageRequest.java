// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DelaySeconds")
    public Integer delaySeconds;

    /**
     * <strong>example:</strong>
     * <p>&quot;Hello MNS&quot;</p>
     */
    @NameInMap("MessageBody")
    public String messageBody;

    /**
     * <strong>example:</strong>
     * <p>group-123</p>
     */
    @NameInMap("MessageGroupId")
    public String messageGroupId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;:&quot;value2&quot;}</p>
     */
    @NameInMap("UserProperties")
    public java.util.Map<String, UserPropertiesValue> userProperties;

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

    public SendMessageRequest setUserProperties(java.util.Map<String, UserPropertiesValue> userProperties) {
        this.userProperties = userProperties;
        return this;
    }
    public java.util.Map<String, UserPropertiesValue> getUserProperties() {
        return this.userProperties;
    }

}
