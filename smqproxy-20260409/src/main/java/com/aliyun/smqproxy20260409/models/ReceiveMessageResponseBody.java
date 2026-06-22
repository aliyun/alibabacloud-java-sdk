// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class ReceiveMessageResponseBody extends TeaModel {
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

    @NameInMap("NextVisibleTime")
    public Long nextVisibleTime;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("ReceiptHandle")
    public String receiptHandle;

    @NameInMap("UserProperties")
    public String userProperties;

    public static ReceiveMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReceiveMessageResponseBody self = new ReceiveMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ReceiveMessageResponseBody setDequeueCount(Long dequeueCount) {
        this.dequeueCount = dequeueCount;
        return this;
    }
    public Long getDequeueCount() {
        return this.dequeueCount;
    }

    public ReceiveMessageResponseBody setEnqueueTime(Long enqueueTime) {
        this.enqueueTime = enqueueTime;
        return this;
    }
    public Long getEnqueueTime() {
        return this.enqueueTime;
    }

    public ReceiveMessageResponseBody setFirstDequeueTime(Long firstDequeueTime) {
        this.firstDequeueTime = firstDequeueTime;
        return this;
    }
    public Long getFirstDequeueTime() {
        return this.firstDequeueTime;
    }

    public ReceiveMessageResponseBody setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

    public ReceiveMessageResponseBody setMessageBodyMD5(String messageBodyMD5) {
        this.messageBodyMD5 = messageBodyMD5;
        return this;
    }
    public String getMessageBodyMD5() {
        return this.messageBodyMD5;
    }

    public ReceiveMessageResponseBody setMessageGroupId(String messageGroupId) {
        this.messageGroupId = messageGroupId;
        return this;
    }
    public String getMessageGroupId() {
        return this.messageGroupId;
    }

    public ReceiveMessageResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ReceiveMessageResponseBody setNextVisibleTime(Long nextVisibleTime) {
        this.nextVisibleTime = nextVisibleTime;
        return this;
    }
    public Long getNextVisibleTime() {
        return this.nextVisibleTime;
    }

    public ReceiveMessageResponseBody setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public ReceiveMessageResponseBody setReceiptHandle(String receiptHandle) {
        this.receiptHandle = receiptHandle;
        return this;
    }
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    public ReceiveMessageResponseBody setUserProperties(String userProperties) {
        this.userProperties = userProperties;
        return this;
    }
    public String getUserProperties() {
        return this.userProperties;
    }

}
