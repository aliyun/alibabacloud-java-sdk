// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppInstanceFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>81bc5a34-1d8d-4ef7-a208-7401c51b054b</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>sdms-test/static/</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    public static DeleteAppInstanceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInstanceFileRequest self = new DeleteAppInstanceFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppInstanceFileRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DeleteAppInstanceFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
