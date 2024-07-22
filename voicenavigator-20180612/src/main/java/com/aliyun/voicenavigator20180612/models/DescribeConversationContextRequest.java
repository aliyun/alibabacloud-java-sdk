// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationContextRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>026ca0f4-483b-4252-ae1d-1f15f056f8b9</p>
     */
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
