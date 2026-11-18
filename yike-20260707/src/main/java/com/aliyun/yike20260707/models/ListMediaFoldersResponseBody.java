// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ListMediaFoldersResponseBody extends TeaModel {
    /**
     * <p>The list of folders.</p>
     */
    @NameInMap("FolderList")
    public java.util.List<ListMediaFoldersResponseBodyFolderList> folderList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B6524F7-*****-A55F-B7DEA1EC628A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMediaFoldersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaFoldersResponseBody self = new ListMediaFoldersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaFoldersResponseBody setFolderList(java.util.List<ListMediaFoldersResponseBodyFolderList> folderList) {
        this.folderList = folderList;
        return this;
    }
    public java.util.List<ListMediaFoldersResponseBodyFolderList> getFolderList() {
        return this.folderList;
    }

    public ListMediaFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMediaFoldersResponseBodyFolderList extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The folder ID. The ID of the default folder is fixed to <code>fd_{ProductionId}_default</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>fd_pd_1585***_default</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The folder name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default folder</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>Indicates whether the folder is the default folder. Each project has exactly one default folder.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the project to which the folder belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_1585***</p>
         */
        @NameInMap("ProductionId")
        public String productionId;

        public static ListMediaFoldersResponseBodyFolderList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaFoldersResponseBodyFolderList self = new ListMediaFoldersResponseBodyFolderList();
            return TeaModel.build(map, self);
        }

        public ListMediaFoldersResponseBodyFolderList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMediaFoldersResponseBodyFolderList setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListMediaFoldersResponseBodyFolderList setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public ListMediaFoldersResponseBodyFolderList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListMediaFoldersResponseBodyFolderList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListMediaFoldersResponseBodyFolderList setProductionId(String productionId) {
            this.productionId = productionId;
            return this;
        }
        public String getProductionId() {
            return this.productionId;
        }

    }

}
