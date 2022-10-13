// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ListConversationDetailsRequest extends TeaModel {
    @NameInMap("ConversationId")
    public String conversationId;

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
