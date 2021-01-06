// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListFoldersForParentResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Folders")
    @Validation(required = true)
    public ListFoldersForParentResponseFolders folders;

    public static ListFoldersForParentResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersForParentResponse self = new ListFoldersForParentResponse();
        return TeaModel.build(map, self);
    }

    public ListFoldersForParentResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFoldersForParentResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFoldersForParentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFoldersForParentResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFoldersForParentResponse setFolders(ListFoldersForParentResponseFolders folders) {
        this.folders = folders;
        return this;
    }
    public ListFoldersForParentResponseFolders getFolders() {
        return this.folders;
    }

    public static class ListFoldersForParentResponseFoldersFolder extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("FolderName")
        @Validation(required = true)
        public String folderName;

        public static ListFoldersForParentResponseFoldersFolder build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersForParentResponseFoldersFolder self = new ListFoldersForParentResponseFoldersFolder();
            return TeaModel.build(map, self);
        }

        public ListFoldersForParentResponseFoldersFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFoldersForParentResponseFoldersFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListFoldersForParentResponseFoldersFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

    public static class ListFoldersForParentResponseFolders extends TeaModel {
        @NameInMap("Folder")
        @Validation(required = true)
        public java.util.List<ListFoldersForParentResponseFoldersFolder> folder;

        public static ListFoldersForParentResponseFolders build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersForParentResponseFolders self = new ListFoldersForParentResponseFolders();
            return TeaModel.build(map, self);
        }

        public ListFoldersForParentResponseFolders setFolder(java.util.List<ListFoldersForParentResponseFoldersFolder> folder) {
            this.folder = folder;
            return this;
        }
        public java.util.List<ListFoldersForParentResponseFoldersFolder> getFolder() {
            return this.folder;
        }

    }

}
