// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListYikeAssetFoldersResponseBody extends TeaModel {
    @NameInMap("FolderList")
    public java.util.List<ListYikeAssetFoldersResponseBodyFolderList> folderList;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("FolderName")
        public String folderName;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("ProductionId")
        public String productionId;

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
