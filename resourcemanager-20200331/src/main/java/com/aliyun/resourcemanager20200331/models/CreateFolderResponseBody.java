// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateFolderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Folder")
    public CreateFolderResponseBodyFolder folder;

    public static CreateFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFolderResponseBody self = new CreateFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFolderResponseBody setFolder(CreateFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public CreateFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public static class CreateFolderResponseBodyFolder extends TeaModel {
        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ParentFolderId")
        public String parentFolderId;

        @NameInMap("FolderName")
        public String folderName;

        public static CreateFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            CreateFolderResponseBodyFolder self = new CreateFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public CreateFolderResponseBodyFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public CreateFolderResponseBodyFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateFolderResponseBodyFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

        public CreateFolderResponseBodyFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

    }

}
