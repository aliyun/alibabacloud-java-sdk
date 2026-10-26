// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class RespondAgentConversationActionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("accepted")
    public Boolean accepted;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("continuationCreated")
    public Boolean continuationCreated;

    /**
     * <strong>example:</strong>
     * <p>0198c8a91f4d7f01a3c21e98</p>
     */
    @NameInMap("runId")
    public String runId;

    public static RespondAgentConversationActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RespondAgentConversationActionResponseBody self = new RespondAgentConversationActionResponseBody();
        return TeaModel.build(map, self);
    }

    public RespondAgentConversationActionResponseBody setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public RespondAgentConversationActionResponseBody setContinuationCreated(Boolean continuationCreated) {
        this.continuationCreated = continuationCreated;
        return this;
    }
    public Boolean getContinuationCreated() {
        return this.continuationCreated;
    }

    public RespondAgentConversationActionResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

}
