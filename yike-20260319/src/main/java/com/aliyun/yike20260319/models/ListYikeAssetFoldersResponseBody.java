// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListYikeAssetFoldersResponseBody extends TeaModel {
    /**
     * <p>The folder list.</p>
     */
    @NameInMap("FolderList")
    public java.util.List<ListYikeAssetFoldersResponseBodyFolderList> folderList;

    /**
     * <p>The maximum number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>Token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of folders.</p>
     * 
     * <strong>example:</strong>
     * <p>78</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListYikeAssetFoldersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListYikeAssetFoldersResponseBody self = new ListYikeAssetFoldersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListYikeAssetFoldersResponseBody setFolderList(java.util.List<ListYikeAssetFoldersResponseBodyFolderList> folderList) {
        this.folderList = folderList;
        return this;
    }
    public java.util.List<ListYikeAssetFoldersResponseBodyFolderList> getFolderList() {
        return this.folderList;
    }

    public ListYikeAssetFoldersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListYikeAssetFoldersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListYikeAssetFoldersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListYikeAssetFoldersResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListYikeAssetFoldersResponseBodyFolderList extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-03T02:23:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-YhFKIuciRP</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The folder name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("FolderName")
        public String folderName;

        /**
         * <p>Indicates whether the folder is the default folder.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_1833************</p>
         */
        @NameInMap("ProductionId")
        public String productionId;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-odl2p61i4vfbph4g</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListYikeAssetFoldersResponseBodyFolderList build(java.util.Map<String, ?> map) throws Exception {
            ListYikeAssetFoldersResponseBodyFolderList self = new ListYikeAssetFoldersResponseBodyFolderList();
            return TeaModel.build(map, self);
        }

        public ListYikeAssetFoldersResponseBodyFolderList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setProductionId(String productionId) {
            this.productionId = productionId;
            return this;
        }
        public String getProductionId() {
            return this.productionId;
        }

        public ListYikeAssetFoldersResponseBodyFolderList setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
