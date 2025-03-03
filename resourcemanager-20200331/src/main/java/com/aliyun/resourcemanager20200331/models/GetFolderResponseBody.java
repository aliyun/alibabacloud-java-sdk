// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetFolderResponseBody extends TeaModel {
    /**
     * <p>The information of the folder.</p>
     */
    @NameInMap("Folder")
    public GetFolderResponseBodyFolder folder;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C2CBCA30-C8DD-423E-B4AD-4FB694C9180C</p>
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
         * 
         * <strong>example:</strong>
         * <p>2021-06-15T06:39:08.521Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-Jyl5U7****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The name of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>Applications</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>r-Wm****</p>
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
