// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class ListFoldersForParentResponseBody extends TeaModel {
    @NameInMap("Folders")
    public ListFoldersForParentResponseBodyFolders folders;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFoldersForParentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFoldersForParentResponseBody self = new ListFoldersForParentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFoldersForParentResponseBody setFolders(ListFoldersForParentResponseBodyFolders folders) {
        this.folders = folders;
        return this;
    }
    public ListFoldersForParentResponseBodyFolders getFolders() {
        return this.folders;
    }

    public ListFoldersForParentResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFoldersForParentResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFoldersForParentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFoldersForParentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFoldersForParentResponseBodyFoldersFolder extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("Name")
        public String name;

        public static ListFoldersForParentResponseBodyFoldersFolder build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersForParentResponseBodyFoldersFolder self = new ListFoldersForParentResponseBodyFoldersFolder();
            return TeaModel.build(map, self);
        }

        public ListFoldersForParentResponseBodyFoldersFolder setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListFoldersForParentResponseBodyFoldersFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListFoldersForParentResponseBodyFoldersFolder setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListFoldersForParentResponseBodyFolders extends TeaModel {
        @NameInMap("Folder")
        public java.util.List<ListFoldersForParentResponseBodyFoldersFolder> folder;

        public static ListFoldersForParentResponseBodyFolders build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersForParentResponseBodyFolders self = new ListFoldersForParentResponseBodyFolders();
            return TeaModel.build(map, self);
        }

        public ListFoldersForParentResponseBodyFolders setFolder(java.util.List<ListFoldersForParentResponseBodyFoldersFolder> folder) {
            this.folder = folder;
            return this;
        }
        public java.util.List<ListFoldersForParentResponseBodyFoldersFolder> getFolder() {
            return this.folder;
        }

    }

}
