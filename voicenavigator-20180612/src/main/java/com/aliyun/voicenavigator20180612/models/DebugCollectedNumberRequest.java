// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugCollectedNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Number")
    public String number;

    public static DebugCollectedNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugCollectedNumberRequest self = new DebugCollectedNumberRequest();
        return TeaModel.build(map, self);
    }

    public DebugCollectedNumberRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DebugCollectedNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DebugCollectedNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
