// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateLabelResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public String data;

    @NameInMap("ErrorDetail")
    public CreateLabelResponseBodyErrorDetail errorDetail;

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

    public static CreateLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelResponseBody self = new CreateLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLabelResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public CreateLabelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLabelResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public CreateLabelResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateLabelResponseBody setErrorDetail(CreateLabelResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public CreateLabelResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public CreateLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLabelResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CreateLabelResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLabelResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class CreateLabelResponseBodyErrorDetail extends TeaModel {
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

        public static CreateLabelResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateLabelResponseBodyErrorDetail self = new CreateLabelResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public CreateLabelResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateLabelResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public CreateLabelResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateLabelResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateLabelResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public CreateLabelResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public CreateLabelResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public CreateLabelResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public CreateLabelResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public CreateLabelResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CreateLabelResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public CreateLabelResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public CreateLabelResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
