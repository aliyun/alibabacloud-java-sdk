// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>593fe1a2-d0b4-4fde-a2b0-78ad6a438d41</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>pt3/01/31/pengpeixin.png</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    public static DeleteAppFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppFileRequest self = new DeleteAppFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppFileRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DeleteAppFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
