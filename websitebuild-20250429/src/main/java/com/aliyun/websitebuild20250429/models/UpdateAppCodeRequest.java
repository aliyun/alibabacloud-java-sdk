// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppCodeRequest extends TeaModel {
    /**
     * <p>Edit operation Content (JSON)</p>
     * 
     * <strong>example:</strong>
     * <p>verify_6554d8cc0de584306d16506dd119cbfc</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>session ID</p>
     * 
     * <strong>example:</strong>
     * <p>81bc5a34-1d8d-4ef7-a208-7401c51b054b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    public static UpdateAppCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppCodeRequest self = new UpdateAppCodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppCodeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateAppCodeRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

}
