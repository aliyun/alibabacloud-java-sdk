// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class EndDialogueRequest extends TeaModel {
    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("HangUpParams")
    public String hangUpParams;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    public static EndDialogueRequest build(java.util.Map<String, ?> map) throws Exception {
        EndDialogueRequest self = new EndDialogueRequest();
        return TeaModel.build(map, self);
    }

    public EndDialogueRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public EndDialogueRequest setHangUpParams(String hangUpParams) {
        this.hangUpParams = hangUpParams;
        return this;
    }
    public String getHangUpParams() {
        return this.hangUpParams;
    }

    public EndDialogueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EndDialogueRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

}
