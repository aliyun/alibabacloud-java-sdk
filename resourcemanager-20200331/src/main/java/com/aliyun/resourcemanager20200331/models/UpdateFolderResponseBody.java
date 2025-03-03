// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateFolderResponseBody extends TeaModel {
    /**
     * <p>The information of the folder.</p>
     */
    @NameInMap("Folder")
    public UpdateFolderResponseBodyFolder folder;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C2CBCA30-C8DD-423E-B4AD-4FB694C9180C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderResponseBody self = new UpdateFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFolderResponseBody setFolder(UpdateFolderResponseBodyFolder folder) {
        this.folder = folder;
        return this;
    }
    public UpdateFolderResponseBodyFolder getFolder() {
        return this.folder;
    }

    public UpdateFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateFolderResponseBodyFolder extends TeaModel {
        /**
         * <p>The time when the folder was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-19T09:34:50.757Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-u8B321****</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The name of the folder.</p>
         * 
         * <strong>example:</strong>
         * <p>rdFolder</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>r-b1****</p>
         */
        @NameInMap("ParentFolderId")
        public String parentFolderId;

        public static UpdateFolderResponseBodyFolder build(java.util.Map<String, ?> map) throws Exception {
            UpdateFolderResponseBodyFolder self = new UpdateFolderResponseBodyFolder();
            return TeaModel.build(map, self);
        }

        public UpdateFolderResponseBodyFolder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateFolderResponseBodyFolder setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public UpdateFolderResponseBodyFolder setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public UpdateFolderResponseBodyFolder setParentFolderId(String parentFolderId) {
            this.parentFolderId = parentFolderId;
            return this;
        }
        public String getParentFolderId() {
            return this.parentFolderId;
        }

    }

}
