// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetFolderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Folder")
    @Validation(required = true)
    public GetFolderResponseFolder folder;

    public static GetFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponse self = new GetFolderResponse();
        return TeaModel.build(map, self);
    }

    public GetFolderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFolderResponse setFolder(GetFolderResponseFolder folder) {
        this.folder = folder;
        return this;
    }
    public GetFolderResponseFolder getFolder() {
        return this.folder;
    }

    public static class GetFolderResponseFolder extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("FolderId")
        @Validation(required = true)
        public String folderId;

        @NameInMap("FolderName")
        @Validation(required = true)
        public String folderName;

        @NameInMap("ParentFolderId")
        @Validation(required = true)
        public String parentFolderId;

        public static GetFolderResponseFolder build(java.util.Map<String, ?> map) throws Exception {
            GetFolderResponseFolder self = new GetFolderResponseFolder();
            return TeaModel.build(map, self);
        }

        public GetFolderResponseFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetFolderResponseFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetFolderResponseFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public GetFolderResponseFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

    }

}
