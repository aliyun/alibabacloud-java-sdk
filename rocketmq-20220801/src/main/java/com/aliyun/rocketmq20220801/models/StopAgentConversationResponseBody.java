// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class StopAgentConversationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stopped")
    public Boolean stopped;

    public static StopAgentConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopAgentConversationResponseBody self = new StopAgentConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public StopAgentConversationResponseBody setStopped(Boolean stopped) {
        this.stopped = stopped;
        return this;
    }
    public Boolean getStopped() {
        return this.stopped;
    }

}
