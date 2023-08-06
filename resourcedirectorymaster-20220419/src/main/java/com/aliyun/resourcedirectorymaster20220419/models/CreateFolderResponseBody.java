// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CreateFolderResponseBody extends TeaModel {
    /**
     * <p>The information about the folder.</p>
     */
    @NameInMap("Folder")
    public CreateFolderResponseBodyFolder folder;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderResponseBody self = new CreateFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFolderResponseBody setFolder(CreateFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public CreateFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public CreateFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateFolderResponseBodyFolder extends TeaModel {
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

        public static CreateFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            CreateFolderResponseBodyFolder self = new CreateFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public CreateFolderResponseBodyFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateFolderResponseBodyFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public CreateFolderResponseBodyFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public CreateFolderResponseBodyFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

    }

}
