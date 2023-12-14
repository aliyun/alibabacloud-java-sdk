// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class ListRecentViewReportsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListRecentViewReportsResponseBodyResult result;

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
        @NameInMap("Favorite")
        public Boolean favorite;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HasEditAuth")
        public Boolean hasEditAuth;

        @NameInMap("HasViewAuth")
        public Boolean hasViewAuth;

        @NameInMap("LatestViewTime")
        public String latestViewTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerNum")
        public String ownerNum;

        @NameInMap("PublishStatus")
        public Integer publishStatus;

        @NameInMap("TreeId")
        public String treeId;

        @NameInMap("Type")
        public String type;

        @NameInMap("ViewCount")
        public Long viewCount;

        @NameInMap("WorkspaceId")
        public String workspaceId;

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
        @NameInMap("Data")
        public java.util.List<ListRecentViewReportsResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListRecentViewReportsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRecentViewReportsResponseBodyResult self = new ListRecentViewReportsResponseBodyResult();
            return TeaModel.build(map, self);
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
