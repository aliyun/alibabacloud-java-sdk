// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class PeekMessageResponseBody extends TeaModel {
    @NameInMap("DequeueCount")
    public Long dequeueCount;

    @NameInMap("EnqueueTime")
    public Long enqueueTime;

    @NameInMap("FirstDequeueTime")
    public Long firstDequeueTime;

    @NameInMap("MessageBody")
    public String messageBody;

    @NameInMap("MessageBodyMD5")
    public String messageBodyMD5;

    @NameInMap("MessageGroupId")
    public String messageGroupId;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("UserProperties")
    public String userProperties;

    public static PeekMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PeekMessageResponseBody self = new PeekMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public PeekMessageResponseBody setDequeueCount(Long dequeueCount) {
        this.dequeueCount = dequeueCount;
        return this;
    }
    public Long getDequeueCount() {
        return this.dequeueCount;
    }

    public PeekMessageResponseBody setEnqueueTime(Long enqueueTime) {
        this.enqueueTime = enqueueTime;
        return this;
    }
    public Long getEnqueueTime() {
        return this.enqueueTime;
    }

    public PeekMessageResponseBody setFirstDequeueTime(Long firstDequeueTime) {
        this.firstDequeueTime = firstDequeueTime;
        return this;
    }
    public Long getFirstDequeueTime() {
        return this.firstDequeueTime;
    }

    public PeekMessageResponseBody setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

    public PeekMessageResponseBody setMessageBodyMD5(String messageBodyMD5) {
        this.messageBodyMD5 = messageBodyMD5;
        return this;
    }
    public String getMessageBodyMD5() {
        return this.messageBodyMD5;
    }

    public PeekMessageResponseBody setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
        return this;
    }
    public String getMessageGroupId() {
        return this.messageGroupId;
    }

    public PeekMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PeekMessageResponseBody setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public PeekMessageResponseBody setUserProperties(String userProperties) {
        this.userProperties = userProperties;
        return this;
    }
    public String getUserProperties() {
        return this.userProperties;
    }

}
