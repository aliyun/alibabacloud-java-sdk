// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReleaseProjectResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public Object data;

    @NameInMap("ErrorDetail")
    public ReleaseProjectResponseBodyErrorDetail errorDetail;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ReleaseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProjectResponseBody self = new ReleaseProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ReleaseProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReleaseProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ReleaseProjectResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ReleaseProjectResponseBody setErrorDetail(ReleaseProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ReleaseProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ReleaseProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ReleaseProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ReleaseProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReleaseProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ReleaseProjectResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static ReleaseProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ReleaseProjectResponseBodyErrorDetail self = new ReleaseProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ReleaseProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ReleaseProjectResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ReleaseProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReleaseProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ReleaseProjectResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ReleaseProjectResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ReleaseProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ReleaseProjectResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ReleaseProjectResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ReleaseProjectResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ReleaseProjectResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ReleaseProjectResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ReleaseProjectResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
