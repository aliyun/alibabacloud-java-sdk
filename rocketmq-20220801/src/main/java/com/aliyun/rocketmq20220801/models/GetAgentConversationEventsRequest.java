// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetAgentConversationEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("after")
    public Long after;

    public static GetAgentConversationEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConversationEventsRequest self = new GetAgentConversationEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentConversationEventsRequest setAfter(Long after) {
        this.after = after;
        return this;
    }
    public Long getAfter() {
        return this.after;
    }

}
