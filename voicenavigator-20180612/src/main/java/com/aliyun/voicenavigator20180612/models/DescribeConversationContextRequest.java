// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationContextRequest extends TeaModel {
    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeConversationContextRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConversationContextRequest self = new DescribeConversationContextRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConversationContextRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DescribeConversationContextRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
