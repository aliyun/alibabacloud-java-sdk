// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class SteerAgentConversationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("accepted")
    public Boolean accepted;

    /**
     * <strong>example:</strong>
     * <p>msg-20260819-0001</p>
     */
    @NameInMap("messageId")
    public String messageId;

    public static SteerAgentConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SteerAgentConversationResponseBody self = new SteerAgentConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public SteerAgentConversationResponseBody setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public SteerAgentConversationResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
