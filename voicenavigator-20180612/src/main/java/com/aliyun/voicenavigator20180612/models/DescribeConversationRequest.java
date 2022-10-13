// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationRequest extends TeaModel {
    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConversationRequest self = new DescribeConversationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConversationRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DescribeConversationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
