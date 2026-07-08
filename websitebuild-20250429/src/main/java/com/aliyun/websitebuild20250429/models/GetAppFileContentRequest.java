// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppFileContentRequest extends TeaModel {
    /**
     * <p>The conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The file path.</p>
     * 
     * <strong>example:</strong>
     * <p>index.html</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    public static GetAppFileContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppFileContentRequest self = new GetAppFileContentRequest();
        return TeaModel.build(map, self);
    }

    public GetAppFileContentRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetAppFileContentRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
