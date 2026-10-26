// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteAgentConversationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ok")
    public Boolean ok;

    public static DeleteAgentConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentConversationResponseBody self = new DeleteAgentConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentConversationResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

}
