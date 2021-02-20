// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetFolderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Folder")
    public GetFolderResponseBodyFolder folder;

    public static GetFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponseBody self = new GetFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFolderResponseBody setFolder(GetFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public GetFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public static class GetFolderResponseBodyFolder extends TeaModel {
        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FolderName")
        public String folderName;

        @NameInMap("ParentFolderId")
        public String parentFolderId;

        public static GetFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            GetFolderResponseBodyFolder self = new GetFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public GetFolderResponseBodyFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetFolderResponseBodyFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

    }

}
