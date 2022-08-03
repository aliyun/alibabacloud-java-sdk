// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListParentsResponseBody extends TeaModel {
    @NameInMap("Folders")
    public ListParentsResponseBodyFolders folders;

    @NameInMap("RequestId")
    public String requestId;

    public static ListParentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParentsResponseBody self = new ListParentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParentsResponseBody setFolders(ListParentsResponseBodyFolders folders) {
        this.folders = folders;
        return this;
    }
    public ListParentsResponseBodyFolders getFolders() {
        return this.folders;
    }

    public ListParentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListParentsResponseBodyFoldersFolder extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("Name")
        public String name;

        public static ListParentsResponseBodyFoldersFolder build(java.util.Map<String, ?> map) throws Exception {
            ListParentsResponseBodyFoldersFolder self = new ListParentsResponseBodyFoldersFolder();
            return TeaModel.build(map, self);
        }

        public ListParentsResponseBodyFoldersFolder setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListParentsResponseBodyFoldersFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListParentsResponseBodyFoldersFolder setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListParentsResponseBodyFolders extends TeaModel {
        @NameInMap("Folder")
        public java.util.List<ListParentsResponseBodyFoldersFolder> folder;

        public static ListParentsResponseBodyFolders build(java.util.Map<String, ?> map) throws Exception {
            ListParentsResponseBodyFolders self = new ListParentsResponseBodyFolders();
            return TeaModel.build(map, self);
        }

        public ListParentsResponseBodyFolders setFolder(java.util.List<ListParentsResponseBodyFoldersFolder> folder) {
            this.folder = folder;
            return this;
        }
        public java.util.List<ListParentsResponseBodyFoldersFolder> getFolder() {
            return this.folder;
        }

    }

}
