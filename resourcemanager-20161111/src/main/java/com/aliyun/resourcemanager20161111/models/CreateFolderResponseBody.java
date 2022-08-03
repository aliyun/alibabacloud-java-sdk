// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class CreateFolderResponseBody extends TeaModel {
    @NameInMap("Folder")
    public CreateFolderResponseBodyFolder folder;

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
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentFolderId")
        public String parentFolderId;

        public static CreateFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            CreateFolderResponseBodyFolder self = new CreateFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public CreateFolderResponseBodyFolder setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateFolderResponseBodyFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public CreateFolderResponseBodyFolder setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
