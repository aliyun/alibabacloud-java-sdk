// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppWorkspaceDirectoryRequest extends TeaModel {
    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5b7105a2-2999-430b-ba23-ba09149d5434</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The directory depth. This parameter is optional. If set to null or 0, all levels are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Deep")
    public Integer deep;

    /**
     * <p>The directory path. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    public static GetAppWorkspaceDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppWorkspaceDirectoryRequest self = new GetAppWorkspaceDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public GetAppWorkspaceDirectoryRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public GetAppWorkspaceDirectoryRequest setDeep(Integer deep) {
        this.deep = deep;
        return this;
    }
    public Integer getDeep() {
        return this.deep;
    }

    public GetAppWorkspaceDirectoryRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
