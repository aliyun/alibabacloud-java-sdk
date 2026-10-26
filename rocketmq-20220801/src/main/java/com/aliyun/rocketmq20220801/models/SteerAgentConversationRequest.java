// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class SteerAgentConversationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cmd-20260819-0001</p>
     */
    @NameInMap("commandId")
    public String commandId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>请优先检查消费组在线状态</p>
     */
    @NameInMap("message")
    public String message;

    public static SteerAgentConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        SteerAgentConversationRequest self = new SteerAgentConversationRequest();
        return TeaModel.build(map, self);
    }

    public SteerAgentConversationRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public SteerAgentConversationRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
