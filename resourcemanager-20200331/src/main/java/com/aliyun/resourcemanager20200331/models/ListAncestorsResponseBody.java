// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAncestorsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Folders")
    public ListAncestorsResponseBodyFolders folders;

    public static ListAncestorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAncestorsResponseBody self = new ListAncestorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAncestorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAncestorsResponseBody setFolders(ListAncestorsResponseBodyFolders folders) {
        this.folders = folders;
        return this;
    }
    public ListAncestorsResponseBodyFolders getFolders() {
        return this.folders;
    }

    public static class ListAncestorsResponseBodyFoldersFolder extends TeaModel {
        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FolderName")
        public String folderName;

        public static ListAncestorsResponseBodyFoldersFolder build(java.util.Map<String, ?> map) throws Exception {
            ListAncestorsResponseBodyFoldersFolder self = new ListAncestorsResponseBodyFoldersFolder();
            return TeaModel.build(map, self);
        }

        public ListAncestorsResponseBodyFoldersFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAncestorsResponseBodyFoldersFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAncestorsResponseBodyFoldersFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

    public static class ListAncestorsResponseBodyFolders extends TeaModel {
        @NameInMap("Folder")
        public java.util.List<ListAncestorsResponseBodyFoldersFolder> folder;

        public static ListAncestorsResponseBodyFolders build(java.util.Map<String, ?> map) throws Exception {
            ListAncestorsResponseBodyFolders self = new ListAncestorsResponseBodyFolders();
            return TeaModel.build(map, self);
        }

        public ListAncestorsResponseBodyFolders setFolder(java.util.List<ListAncestorsResponseBodyFoldersFolder> folder) {
            this.folder = folder;
            return this;
        }
        public java.util.List<ListAncestorsResponseBodyFoldersFolder> getFolder() {
            return this.folder;
        }

    }

}
