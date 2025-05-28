// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListFavoriteReportsResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the query result.</p>
     */
    @NameInMap("Result")
    public ListFavoriteReportsResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFavoriteReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFavoriteReportsResponseBody self = new ListFavoriteReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFavoriteReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFavoriteReportsResponseBody setResult(ListFavoriteReportsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListFavoriteReportsResponseBodyResult getResult() {
        return this.result;
    }

    public ListFavoriteReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFavoriteReportsResponseBodyResultData extends TeaModel {
        /**
         * <p>Indicates whether the user has favorited the work.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Favorite")
        public Boolean favorite;

        /**
         * <p>The timestamp when the work was favorited.</p>
         * 
         * <strong>example:</strong>
         * <p>1640088615000</p>
         */
        @NameInMap("FavoriteDate")
        public String favoriteDate;

        /**
         * <p>Timestamp of the work creation.</p>
         * 
         * <strong>example:</strong>
         * <p>1640088615000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Timestamp of the work modification.</p>
         * 
         * <strong>example:</strong>
         * <p>1640595729000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the user has edit permission for the work.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasEditAuth")
        public Boolean hasEditAuth;

        /**
         * <p>Check if the user has the permission to view the work.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasViewAuth")
        public Boolean hasViewAuth;

        /**
         * <p>Name of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Alibaba Cloud account name of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>UserID of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1365*****238860</p>
         */
        @NameInMap("OwnerNum")
        public String ownerNum;

        /**
         * <p>Publication status of the work. Value range:</p>
         * <ul>
         * <li>0: Not published</li>
         * <li>1: Published</li>
         * <li>2: Saved with modifications, not published</li>
         * <li>3: Offline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublishStatus")
        public Integer publishStatus;

        /**
         * <p>Work ID.</p>
         * 
         * <strong>example:</strong>
         * <p>977c7698-<strong><strong>-</strong></strong>-****-44b7304d20fc</p>
         */
        @NameInMap("TreeId")
        public String treeId;

        /**
         * <p>Type of the work. Value range:</p>
         * <ul>
         * <li>DATAPRODUCT: Data Portal</li>
         * <li>PAGE: Dashboard</li>
         * <li>REPORT: Spreadsheet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>523793cb-<strong><strong>-</strong></strong>-****-aa71c65ffa39</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>The name of the workspace to which the work belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListFavoriteReportsResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListFavoriteReportsResponseBodyResultData self = new ListFavoriteReportsResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListFavoriteReportsResponseBodyResultData setFavorite(Boolean favorite) {
            this.favorite = favorite;
            return this;
        }
        public Boolean getFavorite() {
            return this.favorite;
        }

        public ListFavoriteReportsResponseBodyResultData setFavoriteDate(String favoriteDate) {
            this.favoriteDate = favoriteDate;
            return this;
        }
        public String getFavoriteDate() {
            return this.favoriteDate;
        }

        public ListFavoriteReportsResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFavoriteReportsResponseBodyResultData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListFavoriteReportsResponseBodyResultData setHasEditAuth(Boolean hasEditAuth) {
            this.hasEditAuth = hasEditAuth;
            return this;
        }
        public Boolean getHasEditAuth() {
            return this.hasEditAuth;
        }

        public ListFavoriteReportsResponseBodyResultData setHasViewAuth(Boolean hasViewAuth) {
            this.hasViewAuth = hasViewAuth;
            return this;
        }
        public Boolean getHasViewAuth() {
            return this.hasViewAuth;
        }

        public ListFavoriteReportsResponseBodyResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFavoriteReportsResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListFavoriteReportsResponseBodyResultData setOwnerNum(String ownerNum) {
            this.ownerNum = ownerNum;
            return this;
        }
        public String getOwnerNum() {
            return this.ownerNum;
        }

        public ListFavoriteReportsResponseBodyResultData setPublishStatus(Integer publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        public ListFavoriteReportsResponseBodyResultData setTreeId(String treeId) {
            this.treeId = treeId;
            return this;
        }
        public String getTreeId() {
            return this.treeId;
        }

        public ListFavoriteReportsResponseBodyResultData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFavoriteReportsResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListFavoriteReportsResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListFavoriteReportsResponseBodyResult extends TeaModel {
        /**
         * <p>List of works queried.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListFavoriteReportsResponseBodyResultData> data;

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Number of rows per page set when requesting the interface.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListFavoriteReportsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListFavoriteReportsResponseBodyResult self = new ListFavoriteReportsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListFavoriteReportsResponseBodyResult setData(java.util.List<ListFavoriteReportsResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListFavoriteReportsResponseBodyResultData> getData() {
            return this.data;
        }

        public ListFavoriteReportsResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListFavoriteReportsResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFavoriteReportsResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListFavoriteReportsResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
