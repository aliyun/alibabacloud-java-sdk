// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetAgentConversationTimelineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("after")
    public Long after;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeImageData")
    public Boolean includeImageData;

    public static GetAgentConversationTimelineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentConversationTimelineRequest self = new GetAgentConversationTimelineRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentConversationTimelineRequest setAfter(Long after) {
        this.after = after;
        return this;
    }
    public Long getAfter() {
        return this.after;
    }

    public GetAgentConversationTimelineRequest setIncludeImageData(Boolean includeImageData) {
        this.includeImageData = includeImageData;
        return this;
    }
    public Boolean getIncludeImageData() {
        return this.includeImageData;
    }

}
