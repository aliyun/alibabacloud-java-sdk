// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateFolderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Folder")
    public UpdateFolderResponseBodyFolder folder;

    public static UpdateFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderResponseBody self = new UpdateFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFolderResponseBody setFolder(UpdateFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public UpdateFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public static class UpdateFolderResponseBodyFolder extends TeaModel {
        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ParentFolderId")
        public String parentFolderId;

        @NameInMap("FolderName")
        public String folderName;

        public static UpdateFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            UpdateFolderResponseBodyFolder self = new UpdateFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public UpdateFolderResponseBodyFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public UpdateFolderResponseBodyFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateFolderResponseBodyFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

        public UpdateFolderResponseBodyFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

}
