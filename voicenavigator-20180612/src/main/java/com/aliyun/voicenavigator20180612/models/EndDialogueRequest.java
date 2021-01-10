// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class EndDialogueRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ConversationId")
    public String conversationId;

    public static EndDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        EndDialogueRequest self = new EndDialogueRequest();
        return TeaModel.build(map, self);
    }

    public EndDialogueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EndDialogueRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

}
