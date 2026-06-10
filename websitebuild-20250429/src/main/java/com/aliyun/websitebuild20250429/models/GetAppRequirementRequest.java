// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppRequirementRequest extends TeaModel {
    /**
     * <p>Session ID</p>
     * 
     * <strong>example:</strong>
     * <p>81bc5a34-1d8d-4ef7-a208-7401c51b054b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    public static GetAppRequirementRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppRequirementRequest self = new GetAppRequirementRequest();
        return TeaModel.build(map, self);
    }

    public GetAppRequirementRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

}
