// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateTopicRequest extends TeaModel {
    @NameInMap("messageType")
    public String messageType;

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
