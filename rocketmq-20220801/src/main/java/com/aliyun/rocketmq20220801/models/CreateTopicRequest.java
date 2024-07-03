// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The type of messages in the topic that you want to create.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>TRANSACTION: transactional messages</li>
     * <li>FIFO: ordered messages</li>
     * <li>DELAY: scheduled messages or delayed Message</li>
     * <li>NORMAL: normal messages</li>
     * </ul>
     * <blockquote>
     * <p>The type of messages in the topic must be the same as the type of messages that you want to send. For example, if you create a topic whose message type is ordered messages, the topic can be used to send and receive only ordered messages.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("messageType")
    public String messageType;

    /**
     * <p>The description of the topic that you want to create.</p>
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
