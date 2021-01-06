// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateFolderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Folder")
    @Validation(required = true)
    public CreateFolderResponseFolder folder;

    public static CreateFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderResponse self = new CreateFolderResponse();
        return TeaModel.build(map, self);
    }

    public CreateFolderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFolderResponse setFolder(CreateFolderResponseFolder folder) {
        this.folder = folder;
        return this;
    }
    public CreateFolderResponseFolder getFolder() {
        return this.folder;
    }

    public static class CreateFolderResponseFolder extends TeaModel {
        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("ParentFolderId")
        @Validation(required = true)
        public String parentFolderId;

        @NameInMap("FolderName")
        @Validation(required = true)
        public String folderName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static CreateFolderResponseFolder build(java.util.Map<String, ?> map) throws Exception {
            CreateFolderResponseFolder self = new CreateFolderResponseFolder();
            return TeaModel.build(map, self);
        }

        public CreateFolderResponseFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public CreateFolderResponseFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

        public CreateFolderResponseFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public CreateFolderResponseFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
