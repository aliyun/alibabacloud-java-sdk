// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class ListFavoriteReportsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListFavoriteReportsResponseBodyResult result;

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

        @NameInMap("WorkspaceId")
        public String workspaceId;

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
        @NameInMap("Data")
        public java.util.List<ListFavoriteReportsResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

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
