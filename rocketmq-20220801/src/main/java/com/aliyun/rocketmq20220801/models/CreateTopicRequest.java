// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    /**
     * <p>The type of messages in the topic that you want to create.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   TRANSACTION: transactional messages</p>
     * <p>*   FIFO: ordered messages</p>
     * <p>*   DELAY: scheduled messages or delayed Message</p>
     * <p>*   NORMAL: normal messages</p>
     * <br>
     * <p>> The type of messages in the topic must be the same as the type of messages that you want to send. For example, if you create a topic whose message type is ordered messages, the topic can be used to send and receive only ordered messages.</p>
     */
    @NameInMap("messageType")
    public String messageType;

    /**
     * <p>The description of the topic that you want to create.</p>
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
