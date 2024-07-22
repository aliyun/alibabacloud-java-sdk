// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2c26e67-5984-4935-984e-bcee52971993</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>82b2eaae-ce5c-45f8-8231-f15b6b27e55c</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListConversationDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConversationDetailsRequest self = new ListConversationDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListConversationDetailsRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public ListConversationDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
