// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryApprovalInfoResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return the result of the interface execution.</p>
     */
    @NameInMap("Result")
    public QueryApprovalInfoResponseBodyResult result;

    /**
     * <p>Indicates whether the API call was successful. Possible values are:</p>
     * <ul>
     * <li>true: success</li>
     * <li>false: failure</li>
     * </ul>
     * 
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
         * <p>Applicant\&quot;s user ID, qbi user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1359508</p>
         */
        @NameInMap("ApplicantId")
        public String applicantId;

        /**
         * <p>Applicant\&quot;s nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>Li Fei</p>
         */
        @NameInMap("ApplicantName")
        public String applicantName;

        /**
         * <p>Application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64813ef6da58e80eef8ed2f9</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>Application reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Development needs</p>
         */
        @NameInMap("ApplyReason")
        public String applyReason;

        /**
         * <p>Approver\&quot;s user ID, qbi user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sdasascasxasd</p>
         */
        @NameInMap("ApproverId")
        public String approverId;

        /**
         * <p>Approver\&quot;s nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>data_fusion_002</p>
         */
        @NameInMap("ApproverName")
        public String approverName;

        /**
         * <p>Whether the resource has been deleted:</p>
         * <ul>
         * <li>true: Deleted</li>
         * <li>false: Not deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeleteFlag")
        public Boolean deleteFlag;

        /**
         * <p>Permission expiration date, timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1708568097135</p>
         */
        @NameInMap("ExpireDate")
        public Long expireDate;

        /**
         * <p>Permission approval status:</p>
         * <ul>
         * <li>0: Under review, corresponding to 0 in the request parameters</li>
         * <li>1: Approved, corresponding to 1 in the request parameters</li>
         * <li>2: Rejected, corresponding to 1 in the request parameters</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FlagStatus")
        public Integer flagStatus;

        /**
         * <p>Application creation time, timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1687315758</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>Application modification time, timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1640595729000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Handling reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Development needs</p>
         */
        @NameInMap("HandleReason")
        public String handleReason;

        /**
         * <p>The ID of the resource for which permission is requested.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-ct4t2e4u2x4ej1bzur</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource for which permission is requested (e.g., report name, space name...).</p>
         * 
         * <strong>example:</strong>
         * <p>Test Resources</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>DASHBOARD</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Workspace</p>
         */
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
        /**
         * <p>Array of approval flow information.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryApprovalInfoResponseBodyResultData> data;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of records requested per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The starting position of the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Start")
        public Integer start;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Integer total;

        /**
         * <p>The total number of pages.</p>
         * 
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
