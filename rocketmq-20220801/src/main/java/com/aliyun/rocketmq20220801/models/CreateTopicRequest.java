// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The expiration time of the lite topic, in minutes.
     * Valid values: 30 to 720.
     * Default value: -1, which indicates the topic never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("liteTopicExpiration")
    public Long liteTopicExpiration;

    /**
     * <p>The maximum transactions per second (TPS) for sending messages.</p>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("maxSendTps")
    public Long maxSendTps;

    /**
     * <p>The message type of the topic to be created.</p>
     * <blockquote>
     * <p>Notice: The type of the topic must be the same as the type of messages sent to the topic. For example, if you create a topic of the ordered message type, the topic can be used only to send and receive ordered messages, not other types of messages.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("messageType")
    public String messageType;

    /**
     * <p>The remarks of the topic to be created.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the remark for test.</p>
     */
    @NameInMap("remark")
    public String remark;

    public static CreateTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRequest self = new CreateTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicRequest setLiteTopicExpiration(Long liteTopicExpiration) {
        this.liteTopicExpiration = liteTopicExpiration;
        return this;
    }
    public Long getLiteTopicExpiration() {
        return this.liteTopicExpiration;
    }

    public CreateTopicRequest setMaxSendTps(Long maxSendTps) {
        this.maxSendTps = maxSendTps;
        return this;
    }
    public Long getMaxSendTps() {
        return this.maxSendTps;
    }

    public CreateTopicRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public CreateTopicRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
