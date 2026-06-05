// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>verify_46630893e2b5efde444c82b4e3707adb</p>
     */
    @NameInMap("Content")
    public String content;

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

    public static UpdateAppFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppFileRequest self = new UpdateAppFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateAppFileRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public UpdateAppFileRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
