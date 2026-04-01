// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class VerifySendMessageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1773718320000</p>
     */
    @NameInMap("deliveryTimeStamp")
    public Long deliveryTimeStamp;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("liteTopicName")
    public String liteTopicName;

    /**
     * <p>The message body.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>testMessageGroup</p>
     */
    @NameInMap("messageGroup")
    public String messageGroup;

    /**
     * <p>The message key.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("messageKey")
    public String messageKey;

    /**
     * <p>The message tag.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("messageTag")
    public String messageTag;

    @NameInMap("userProperties")
    public java.util.Map<String, ?> userProperties;

    public static VerifySendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySendMessageRequest self = new VerifySendMessageRequest();
        return TeaModel.build(map, self);
    }

    public VerifySendMessageRequest setDeliveryTimeStamp(Long deliveryTimeStamp) {
        this.deliveryTimeStamp = deliveryTimeStamp;
        return this;
    }
    public Long getDeliveryTimeStamp() {
        return this.deliveryTimeStamp;
    }

    public VerifySendMessageRequest setLiteTopicName(String liteTopicName) {
        this.liteTopicName = liteTopicName;
        return this;
    }
    public String getLiteTopicName() {
        return this.liteTopicName;
    }

    public VerifySendMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifySendMessageRequest setMessageGroup(String messageGroup) {
        this.messageGroup = messageGroup;
        return this;
    }
    public String getMessageGroup() {
        return this.messageGroup;
    }

    public VerifySendMessageRequest setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }
    public String getMessageKey() {
        return this.messageKey;
    }

    public VerifySendMessageRequest setMessageTag(String messageTag) {
        this.messageTag = messageTag;
        return this;
    }
    public String getMessageTag() {
        return this.messageTag;
    }

    public VerifySendMessageRequest setUserProperties(java.util.Map<String, ?> userProperties) {
        this.userProperties = userProperties;
        return this;
    }
    public java.util.Map<String, ?> getUserProperties() {
        return this.userProperties;
    }

}
