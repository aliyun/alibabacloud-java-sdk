// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class ListSharedReportsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListSharedReportsResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ListSharedReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSharedReportsResponseBody self = new ListSharedReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSharedReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSharedReportsResponseBody setResult(ListSharedReportsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSharedReportsResponseBodyResult getResult() {
        return this.result;
    }

    public ListSharedReportsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSharedReportsResponseBodyResultData extends TeaModel {
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

        public static ListSharedReportsResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListSharedReportsResponseBodyResultData self = new ListSharedReportsResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListSharedReportsResponseBodyResultData setFavorite(Boolean favorite) {
            this.favorite = favorite;
            return this;
        }
        public Boolean getFavorite() {
            return this.favorite;
        }

        public ListSharedReportsResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSharedReportsResponseBodyResultData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListSharedReportsResponseBodyResultData setHasEditAuth(Boolean hasEditAuth) {
            this.hasEditAuth = hasEditAuth;
            return this;
        }
        public Boolean getHasEditAuth() {
            return this.hasEditAuth;
        }

        public ListSharedReportsResponseBodyResultData setHasViewAuth(Boolean hasViewAuth) {
            this.hasViewAuth = hasViewAuth;
            return this;
        }
        public Boolean getHasViewAuth() {
            return this.hasViewAuth;
        }

        public ListSharedReportsResponseBodyResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSharedReportsResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListSharedReportsResponseBodyResultData setOwnerNum(String ownerNum) {
            this.ownerNum = ownerNum;
            return this;
        }
        public String getOwnerNum() {
            return this.ownerNum;
        }

        public ListSharedReportsResponseBodyResultData setPublishStatus(Integer publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        public ListSharedReportsResponseBodyResultData setTreeId(String treeId) {
            this.treeId = treeId;
            return this;
        }
        public String getTreeId() {
            return this.treeId;
        }

        public ListSharedReportsResponseBodyResultData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSharedReportsResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListSharedReportsResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class ListSharedReportsResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListSharedReportsResponseBodyResultData> data;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListSharedReportsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSharedReportsResponseBodyResult self = new ListSharedReportsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSharedReportsResponseBodyResult setData(java.util.List<ListSharedReportsResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListSharedReportsResponseBodyResultData> getData() {
            return this.data;
        }

        public ListSharedReportsResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListSharedReportsResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSharedReportsResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListSharedReportsResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
