// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListFoldersForParentResponseBody extends TeaModel {
    /**
     * <p>The folders.</p>
     */
    @NameInMap("Folders")
    public ListFoldersForParentResponseBodyFolders folders;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
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

    public static class ListFoldersForParentResponseBodyFoldersFolderTagsTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListFoldersForParentResponseBodyFoldersFolderTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersForParentResponseBodyFoldersFolderTagsTag self = new ListFoldersForParentResponseBodyFoldersFolderTagsTag();
            return TeaModel.build(map, self);
        }

        public ListFoldersForParentResponseBodyFoldersFolderTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListFoldersForParentResponseBodyFoldersFolderTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListFoldersForParentResponseBodyFoldersFolderTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListFoldersForParentResponseBodyFoldersFolderTagsTag> tag;

        public static ListFoldersForParentResponseBodyFoldersFolderTags build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersForParentResponseBodyFoldersFolderTags self = new ListFoldersForParentResponseBodyFoldersFolderTags();
            return TeaModel.build(map, self);
        }

        public ListFoldersForParentResponseBodyFoldersFolderTags setTag(java.util.List<ListFoldersForParentResponseBodyFoldersFolderTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListFoldersForParentResponseBodyFoldersFolderTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListFoldersForParentResponseBodyFoldersFolder extends TeaModel {
        /**
         * <p>The time when the folder was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>rd-evic31****</p>
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
         * <p>The tags added to the folder.</p>
         */
        @NameInMap("Tags")
        public ListFoldersForParentResponseBodyFoldersFolderTags tags;

        public static ListFoldersForParentResponseBodyFoldersFolder build(java.util.Map<String, ?> map) throws Exception {
            ListFoldersForParentResponseBodyFoldersFolder self = new ListFoldersForParentResponseBodyFoldersFolder();
            return TeaModel.build(map, self);
        }

        public ListFoldersForParentResponseBodyFoldersFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFoldersForParentResponseBodyFoldersFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListFoldersForParentResponseBodyFoldersFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public ListFoldersForParentResponseBodyFoldersFolder setTags(ListFoldersForParentResponseBodyFoldersFolderTags tags) {
            this.tags = tags;
            return this;
        }
        public ListFoldersForParentResponseBodyFoldersFolderTags getTags() {
            return this.tags;
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
