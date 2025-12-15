// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAuthorizedFoldersResponseBody extends TeaModel {
    /**
     * <p>The folders.</p>
     */
    @NameInMap("Folders")
    public ListAuthorizedFoldersResponseBodyFolders folders;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAuthorizedFoldersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedFoldersResponseBody self = new ListAuthorizedFoldersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedFoldersResponseBody setFolders(ListAuthorizedFoldersResponseBodyFolders folders) {
        this.folders = folders;
        return this;
    }
    public ListAuthorizedFoldersResponseBodyFolders getFolders() {
        return this.folders;
    }

    public ListAuthorizedFoldersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedFoldersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedFoldersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizedFoldersResponseBodyFoldersFolder extends TeaModel {
        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-bVaRIG****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The name of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>project-1</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>The RDPath of the folder.</p>
         */
        @NameInMap("ResourceDirectoryPath")
        public String resourceDirectoryPath;

        public static ListAuthorizedFoldersResponseBodyFoldersFolder build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedFoldersResponseBodyFoldersFolder self = new ListAuthorizedFoldersResponseBodyFoldersFolder();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedFoldersResponseBodyFoldersFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListAuthorizedFoldersResponseBodyFoldersFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public ListAuthorizedFoldersResponseBodyFoldersFolder setResourceDirectoryPath(String resourceDirectoryPath) {
            this.resourceDirectoryPath = resourceDirectoryPath;
            return this;
        }
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

    }

    public static class ListAuthorizedFoldersResponseBodyFolders extends TeaModel {
        @NameInMap("Folder")
        public java.util.List<ListAuthorizedFoldersResponseBodyFoldersFolder> folder;

        public static ListAuthorizedFoldersResponseBodyFolders build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedFoldersResponseBodyFolders self = new ListAuthorizedFoldersResponseBodyFolders();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedFoldersResponseBodyFolders setFolder(java.util.List<ListAuthorizedFoldersResponseBodyFoldersFolder> folder) {
            this.folder = folder;
            return this;
        }
        public java.util.List<ListAuthorizedFoldersResponseBodyFoldersFolder> getFolder() {
            return this.folder;
        }

    }

}
