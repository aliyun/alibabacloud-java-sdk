// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryApprovalInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryApprovalInfoResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryApprovalInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryApprovalInfoResponseBody self = new QueryApprovalInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryApprovalInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryApprovalInfoResponseBody setResult(QueryApprovalInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryApprovalInfoResponseBodyResult getResult() {
        return this.result;
    }

    public QueryApprovalInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryApprovalInfoResponseBodyResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1359508</p>
         */
        @NameInMap("ApplicantId")
        public String applicantId;

        @NameInMap("ApplicantName")
        public String applicantName;

        /**
         * <strong>example:</strong>
         * <p>64813ef6da58e80eef8ed2f9</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <strong>example:</strong>
         * <p>sdasascasxasd</p>
         */
        @NameInMap("ApproverId")
        public String approverId;

        /**
         * <strong>example:</strong>
         * <p>data_fusion_002</p>
         */
        @NameInMap("ApproverName")
        public String approverName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteFlag")
        public Boolean deleteFlag;

        /**
         * <strong>example:</strong>
         * <p>1708568097135</p>
         */
        @NameInMap("ExpireDate")
        public Long expireDate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FlagStatus")
        public Integer flagStatus;

        /**
         * <strong>example:</strong>
         * <p>1687315758</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1640595729000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("HandleReason")
        public String handleReason;

        /**
         * <strong>example:</strong>
         * <p>acl-ct4t2e4u2x4ej1bzur</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>DASHBOARD</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryApprovalInfoResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryApprovalInfoResponseBodyResultData self = new QueryApprovalInfoResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryApprovalInfoResponseBodyResultData setApplicantId(String applicantId) {
            this.applicantId = applicantId;
            return this;
        }
        public String getApplicantId() {
            return this.applicantId;
        }

        public QueryApprovalInfoResponseBodyResultData setApplicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }
        public String getApplicantName() {
            return this.applicantName;
        }

        public QueryApprovalInfoResponseBodyResultData setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public QueryApprovalInfoResponseBodyResultData setApplyReason(String applyReason) {
            this.applyReason = applyReason;
            return this;
        }
        public String getApplyReason() {
            return this.applyReason;
        }

        public QueryApprovalInfoResponseBodyResultData setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public QueryApprovalInfoResponseBodyResultData setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public QueryApprovalInfoResponseBodyResultData setDeleteFlag(Boolean deleteFlag) {
            this.deleteFlag = deleteFlag;
            return this;
        }
        public Boolean getDeleteFlag() {
            return this.deleteFlag;
        }

        public QueryApprovalInfoResponseBodyResultData setExpireDate(Long expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public Long getExpireDate() {
            return this.expireDate;
        }

        public QueryApprovalInfoResponseBodyResultData setFlagStatus(Integer flagStatus) {
            this.flagStatus = flagStatus;
            return this;
        }
        public Integer getFlagStatus() {
            return this.flagStatus;
        }

        public QueryApprovalInfoResponseBodyResultData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryApprovalInfoResponseBodyResultData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryApprovalInfoResponseBodyResultData setHandleReason(String handleReason) {
            this.handleReason = handleReason;
            return this;
        }
        public String getHandleReason() {
            return this.handleReason;
        }

        public QueryApprovalInfoResponseBodyResultData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryApprovalInfoResponseBodyResultData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public QueryApprovalInfoResponseBodyResultData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryApprovalInfoResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryApprovalInfoResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryApprovalInfoResponseBodyResultData> data;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Start")
        public Integer start;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryApprovalInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryApprovalInfoResponseBodyResult self = new QueryApprovalInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryApprovalInfoResponseBodyResult setData(java.util.List<QueryApprovalInfoResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryApprovalInfoResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryApprovalInfoResponseBodyResult setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryApprovalInfoResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryApprovalInfoResponseBodyResult setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public QueryApprovalInfoResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryApprovalInfoResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
