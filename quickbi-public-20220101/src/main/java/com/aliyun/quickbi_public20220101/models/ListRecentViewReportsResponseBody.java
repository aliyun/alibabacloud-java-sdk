// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListRecentViewReportsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Result")
    public ListRecentViewReportsResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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

    public static ListRecentViewReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentViewReportsResponseBody self = new ListRecentViewReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentViewReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecentViewReportsResponseBody setResult(ListRecentViewReportsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRecentViewReportsResponseBodyResult getResult() {
        return this.result;
    }

    public ListRecentViewReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRecentViewReportsResponseBodyResultData extends TeaModel {
        /**
         * <p>Indicates whether the queried user has added the work to favorites.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Favorite")
        public Boolean favorite;

        /**
         * <p>The timestamp when the work was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1496651577000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The timestamp when the work was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1640595729000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the queried user has edit permissions on the work.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasEditAuth")
        public Boolean hasEditAuth;

        /**
         * <p>Indicates whether the queried user has view permissions on the work.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasViewAuth")
        public Boolean hasViewAuth;

        /**
         * <p>The timestamp when the work was last accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>1642067498000</p>
         */
        @NameInMap("LatestViewTime")
        public String latestViewTime;

        /**
         * <p>The name of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>TestReport</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud account name of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The UserID of the work owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1365*****238860</p>
         */
        @NameInMap("OwnerNum")
        public String ownerNum;

        /**
         * <p>The publish status of the work. Valid values:</p>
         * <ul>
         * <li>0: Unpublished.</li>
         * <li>1: Published.</li>
         * <li>2: Modified and saved but not published.</li>
         * <li>3: Offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublishStatus")
        public Integer publishStatus;

        /**
         * <p>The ID of the work.</p>
         * 
         * <strong>example:</strong>
         * <p>977c7698-<strong><strong>-</strong></strong>-****-44b7304d20fc</p>
         */
        @NameInMap("TreeId")
        public String treeId;

        /**
         * <p>The type of the work. Valid values:</p>
         * <ul>
         * <li>DATAPRODUCT: data portal</li>
         * <li>PAGE: dashboard</li>
         * <li>REPORT: workbook</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The number of times the work has been accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ViewCount")
        public Long viewCount;

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
         * <p>TestWorkspace</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListRecentViewReportsResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListRecentViewReportsResponseBodyResultData self = new ListRecentViewReportsResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListRecentViewReportsResponseBodyResultData setFavorite(Boolean favorite) {
            this.favorite = favorite;
            return this;
        }
        public Boolean getFavorite() {
            return this.favorite;
        }

        public ListRecentViewReportsResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListRecentViewReportsResponseBodyResultData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListRecentViewReportsResponseBodyResultData setHasEditAuth(Boolean hasEditAuth) {
            this.hasEditAuth = hasEditAuth;
            return this;
        }
        public Boolean getHasEditAuth() {
            return this.hasEditAuth;
        }

        public ListRecentViewReportsResponseBodyResultData setHasViewAuth(Boolean hasViewAuth) {
            this.hasViewAuth = hasViewAuth;
            return this;
        }
        public Boolean getHasViewAuth() {
            return this.hasViewAuth;
        }

        public ListRecentViewReportsResponseBodyResultData setLatestViewTime(String latestViewTime) {
            this.latestViewTime = latestViewTime;
            return this;
        }
        public String getLatestViewTime() {
            return this.latestViewTime;
        }

        public ListRecentViewReportsResponseBodyResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRecentViewReportsResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListRecentViewReportsResponseBodyResultData setOwnerNum(String ownerNum) {
            this.ownerNum = ownerNum;
            return this;
        }
        public String getOwnerNum() {
            return this.ownerNum;
        }

        public ListRecentViewReportsResponseBodyResultData setPublishStatus(Integer publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        public ListRecentViewReportsResponseBodyResultData setTreeId(String treeId) {
            this.treeId = treeId;
            return this;
        }
        public String getTreeId() {
            return this.treeId;
        }

        public ListRecentViewReportsResponseBodyResultData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRecentViewReportsResponseBodyResultData setViewCount(Long viewCount) {
            this.viewCount = viewCount;
            return this;
        }
        public Long getViewCount() {
            return this.viewCount;
        }

        public ListRecentViewReportsResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListRecentViewReportsResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListRecentViewReportsResponseBodyResult extends TeaModel {
        /**
         * <p>The notice indicating that pagination parameters (such as TotalNum) returned by this API will be deprecated soon.</p>
         * 
         * <strong>example:</strong>
         * <p>The pagination parameters such as TotalNum returned by this API will be deprecated soon. If you are using them, modify your code promptly</p>
         */
        @NameInMap("Attention")
        public String attention;

        /**
         * <p>The list of queried works.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListRecentViewReportsResponseBodyResultData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * <li>Maximum value: 100.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListRecentViewReportsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRecentViewReportsResponseBodyResult self = new ListRecentViewReportsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRecentViewReportsResponseBodyResult setAttention(String attention) {
            this.attention = attention;
            return this;
        }
        public String getAttention() {
            return this.attention;
        }

        public ListRecentViewReportsResponseBodyResult setData(java.util.List<ListRecentViewReportsResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRecentViewReportsResponseBodyResultData> getData() {
            return this.data;
        }

        public ListRecentViewReportsResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListRecentViewReportsResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRecentViewReportsResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListRecentViewReportsResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
