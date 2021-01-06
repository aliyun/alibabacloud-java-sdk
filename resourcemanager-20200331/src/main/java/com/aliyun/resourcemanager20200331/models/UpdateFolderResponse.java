// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateFolderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Folder")
    @Validation(required = true)
    public UpdateFolderResponseFolder folder;

    public static UpdateFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderResponse self = new UpdateFolderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFolderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFolderResponse setFolder(UpdateFolderResponseFolder folder) {
        this.folder = folder;
        return this;
    }
    public UpdateFolderResponseFolder getFolder() {
        return this.folder;
    }

    public static class UpdateFolderResponseFolder extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("FolderName")
        @Validation(required = true)
        public String folderName;

        @NameInMap("ParentFolderId")
        @Validation(required = true)
        public String parentFolderId;

        public static UpdateFolderResponseFolder build(java.util.Map<String, ?> map) throws Exception {
            UpdateFolderResponseFolder self = new UpdateFolderResponseFolder();
            return TeaModel.build(map, self);
        }

        public UpdateFolderResponseFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateFolderResponseFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public UpdateFolderResponseFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public UpdateFolderResponseFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

    }

}
