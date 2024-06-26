// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListAllLabelsResponseBody extends TeaModel {
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
    public java.util.List<ListAllLabelsResponseBodyData> data;

    @NameInMap("ErrorDetail")
    public ListAllLabelsResponseBodyErrorDetail errorDetail;

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
     * <p>29</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAllLabelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllLabelsResponseBody self = new ListAllLabelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllLabelsResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ListAllLabelsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAllLabelsResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ListAllLabelsResponseBody setData(java.util.List<ListAllLabelsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAllLabelsResponseBodyData> getData() {
        return this.data;
    }

    public ListAllLabelsResponseBody setErrorDetail(ListAllLabelsResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ListAllLabelsResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ListAllLabelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAllLabelsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAllLabelsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAllLabelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllLabelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAllLabelsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAllLabelsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>l_4w6r0***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListAllLabelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAllLabelsResponseBodyData self = new ListAllLabelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAllLabelsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAllLabelsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListAllLabelsResponseBodyErrorDetail extends TeaModel {
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
         * <p>Contact the administrator.</p>
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

        public static ListAllLabelsResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ListAllLabelsResponseBodyErrorDetail self = new ListAllLabelsResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ListAllLabelsResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAllLabelsResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ListAllLabelsResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAllLabelsResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAllLabelsResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ListAllLabelsResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ListAllLabelsResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ListAllLabelsResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ListAllLabelsResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ListAllLabelsResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListAllLabelsResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ListAllLabelsResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ListAllLabelsResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
