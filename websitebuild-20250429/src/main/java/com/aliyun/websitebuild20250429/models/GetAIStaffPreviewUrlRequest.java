// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAIStaffPreviewUrlRequest extends TeaModel {
    /**
     * <p>session ID</p>
     * 
     * <strong>example:</strong>
     * <p>81bc5a34-1d8d-4ef7-a208-7401c51b054b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>is application restart required</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    public static GetAIStaffPreviewUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIStaffPreviewUrlRequest self = new GetAIStaffPreviewUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAIStaffPreviewUrlRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetAIStaffPreviewUrlRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

}
