// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAncestorsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Folders")
    @Validation(required = true)
    public ListAncestorsResponseFolders folders;

    public static ListAncestorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAncestorsResponse self = new ListAncestorsResponse();
        return TeaModel.build(map, self);
    }

    public ListAncestorsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAncestorsResponse setFolders(ListAncestorsResponseFolders folders) {
        this.folders = folders;
        return this;
    }
    public ListAncestorsResponseFolders getFolders() {
        return this.folders;
    }

    public static class ListAncestorsResponseFoldersFolder extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("FolderName")
        @Validation(required = true)
        public String folderName;

        public static ListAncestorsResponseFoldersFolder build(java.util.Map<String, ?> map) throws Exception {
            ListAncestorsResponseFoldersFolder self = new ListAncestorsResponseFoldersFolder();
            return TeaModel.build(map, self);
        }

        public ListAncestorsResponseFoldersFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAncestorsResponseFoldersFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAncestorsResponseFoldersFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

    public static class ListAncestorsResponseFolders extends TeaModel {
        @NameInMap("Folder")
        @Validation(required = true)
        public java.util.List<ListAncestorsResponseFoldersFolder> folder;

        public static ListAncestorsResponseFolders build(java.util.Map<String, ?> map) throws Exception {
            ListAncestorsResponseFolders self = new ListAncestorsResponseFolders();
            return TeaModel.build(map, self);
        }

        public ListAncestorsResponseFolders setFolder(java.util.List<ListAncestorsResponseFoldersFolder> folder) {
            this.folder = folder;
            return this;
        }
        public java.util.List<ListAncestorsResponseFoldersFolder> getFolder() {
            return this.folder;
        }

    }

}
