// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSandboxPreviewUrlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    public static GetAppSandboxPreviewUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSandboxPreviewUrlRequest self = new GetAppSandboxPreviewUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSandboxPreviewUrlRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetAppSandboxPreviewUrlRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
