// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class EndDialogueRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8fb819b5-d032-48a9-ae5e-cff041b83596</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;duration\&quot;:40,\&quot;endTime\&quot;:1645082505345,\&quot;hangUpDirection\&quot;:\&quot;ivr\&quot;,\&quot;hasLastPlaybackCompleted\&quot;:true,\&quot;startTime\&quot;:1645082505305}</p>
     */
    @NameInMap("HangUpParams")
    public String hangUpParams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e48e45dd-e47a-4744-a063-f08cbebb1c5a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1399572315967217</p>
     */
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
