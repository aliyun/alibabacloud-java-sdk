// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StartProjectsByLabelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Contact the administrator.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <strong>example:</strong>
     * <p>INNER_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public StartProjectsByLabelResponseBodyData data;

    @NameInMap("ErrorDetail")
    public StartProjectsByLabelResponseBodyErrorDetail errorDetail;

    /**
     * <strong>example:</strong>
     * <p>A system error occurred.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>79</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static StartProjectsByLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartProjectsByLabelResponseBody self = new StartProjectsByLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public StartProjectsByLabelResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public StartProjectsByLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartProjectsByLabelResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public StartProjectsByLabelResponseBody setData(StartProjectsByLabelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartProjectsByLabelResponseBodyData getData() {
        return this.data;
    }

    public StartProjectsByLabelResponseBody setErrorDetail(StartProjectsByLabelResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public StartProjectsByLabelResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public StartProjectsByLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartProjectsByLabelResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public StartProjectsByLabelResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public StartProjectsByLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartProjectsByLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartProjectsByLabelResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class StartProjectsByLabelResponseBodyData extends TeaModel {
        @NameInMap("FailedProjectIds")
        public java.util.List<String> failedProjectIds;

        @NameInMap("SucceedProjectIds")
        public java.util.List<String> succeedProjectIds;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static StartProjectsByLabelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartProjectsByLabelResponseBodyData self = new StartProjectsByLabelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartProjectsByLabelResponseBodyData setFailedProjectIds(java.util.List<String> failedProjectIds) {
            this.failedProjectIds = failedProjectIds;
            return this;
        }
        public java.util.List<String> getFailedProjectIds() {
            return this.failedProjectIds;
        }

        public StartProjectsByLabelResponseBodyData setSucceedProjectIds(java.util.List<String> succeedProjectIds) {
            this.succeedProjectIds = succeedProjectIds;
            return this;
        }
        public java.util.List<String> getSucceedProjectIds() {
            return this.succeedProjectIds;
        }

        public StartProjectsByLabelResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class StartProjectsByLabelResponseBodyErrorDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static StartProjectsByLabelResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            StartProjectsByLabelResponseBodyErrorDetail self = new StartProjectsByLabelResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public StartProjectsByLabelResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public StartProjectsByLabelResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
