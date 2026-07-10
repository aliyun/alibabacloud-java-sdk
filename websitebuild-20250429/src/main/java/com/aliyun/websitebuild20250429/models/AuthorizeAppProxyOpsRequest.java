// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AuthorizeAppProxyOpsRequest extends TeaModel {
    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    public static AuthorizeAppProxyOpsRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAppProxyOpsRequest self = new AuthorizeAppProxyOpsRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeAppProxyOpsRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

}
