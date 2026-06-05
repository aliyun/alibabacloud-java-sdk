// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppConversationLockStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5b7105a2-2999-430b-ba23-ba09149d5434</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    public static GetAppConversationLockStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppConversationLockStatusRequest self = new GetAppConversationLockStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAppConversationLockStatusRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

}
