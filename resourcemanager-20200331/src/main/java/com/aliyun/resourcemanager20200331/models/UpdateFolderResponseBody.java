// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateFolderResponseBody extends TeaModel {
    @NameInMap("Folder")
    public UpdateFolderResponseBodyFolder folder;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderResponseBody self = new UpdateFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFolderResponseBody setFolder(UpdateFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public UpdateFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public UpdateFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateFolderResponseBodyFolder extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("FolderName")
        public String folderName;

        @NameInMap("ParentFolderId")
        public String parentFolderId;

        public static UpdateFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            UpdateFolderResponseBodyFolder self = new UpdateFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public UpdateFolderResponseBodyFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateFolderResponseBodyFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public UpdateFolderResponseBodyFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public UpdateFolderResponseBodyFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

    }

}
