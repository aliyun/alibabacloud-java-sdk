// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListSharedReportsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListSharedReportsResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Favorite")
        public Boolean favorite;

        /**
         * <strong>example:</strong>
         * <p>1640088615000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1644373980000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasEditAuth")
        public Boolean hasEditAuth;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasViewAuth")
        public Boolean hasViewAuth;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <strong>example:</strong>
         * <p>1365*****238860</p>
         */
        @NameInMap("OwnerNum")
        public String ownerNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PublishStatus")
        public Integer publishStatus;

        /**
         * <strong>example:</strong>
         * <p>977c7698-<strong><strong>-</strong></strong>-****-44b7304d20fc</p>
         */
        @NameInMap("TreeId")
        public String treeId;

        /**
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>gfidm145-<strong><strong>-</strong></strong>-9426-8f93be23****</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
