// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15608cce-36be-43d5-9361-178cbe64127b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5daac920-d6c1-429f-a95f-2a798f5255b5</p>
     */
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
