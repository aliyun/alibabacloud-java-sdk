// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetFolderResponseBody extends TeaModel {
    /**
     * <p>The information about the folder.</p>
     */
    @NameInMap("Folder")
    public GetFolderResponseBodyFolder folder;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponseBody self = new GetFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFolderResponseBody setFolder(GetFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public GetFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public GetFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFolderResponseBodyFolder extends TeaModel {
        /**
         * <p>The time when the folder was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the folder.</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The name of the folder.</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>The ID of the parent folder.</p>
         */
        @NameInMap("ParentFolderId")
        public String parentFolderId;

        /**
         * <p>The path of the folder in the resource directory.</p>
         */
        @NameInMap("ResourceDirectoryPath")
        public String resourceDirectoryPath;

        public static GetFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            GetFolderResponseBodyFolder self = new GetFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public GetFolderResponseBodyFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetFolderResponseBodyFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetFolderResponseBodyFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public GetFolderResponseBodyFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

        public GetFolderResponseBodyFolder setResourceDirectoryPath(String resourceDirectoryPath) {
            this.resourceDirectoryPath = resourceDirectoryPath;
            return this;
        }
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

    }

}
