// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResumeOmsOpenAPIProjectResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("ErrorDetail")
    public ResumeOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

    /**
     * <p>The error details.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Example 1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error level. Valid values: CRITICAL, ERROR, and WARN.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ResumeOmsOpenAPIProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeOmsOpenAPIProjectResponseBody self = new ResumeOmsOpenAPIProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeOmsOpenAPIProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ResumeOmsOpenAPIProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResumeOmsOpenAPIProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ResumeOmsOpenAPIProjectResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ResumeOmsOpenAPIProjectResponseBody setErrorDetail(ResumeOmsOpenAPIProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ResumeOmsOpenAPIProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ResumeOmsOpenAPIProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResumeOmsOpenAPIProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ResumeOmsOpenAPIProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ResumeOmsOpenAPIProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResumeOmsOpenAPIProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ResumeOmsOpenAPIProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ResumeOmsOpenAPIProjectResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The suggestions (new).</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The operation that you want to perform. Set the value to **ResumeOmsOpenAPIProject**.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The error description (old).</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The error code (new).</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        public static ResumeOmsOpenAPIProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ResumeOmsOpenAPIProjectResponseBodyErrorDetail self = new ResumeOmsOpenAPIProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ResumeOmsOpenAPIProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ResumeOmsOpenAPIProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ResumeOmsOpenAPIProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ResumeOmsOpenAPIProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
