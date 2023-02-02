// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResetOmsOpenAPIProjectResponseBody extends TeaModel {
    /**
     * <p>The suggestions (old).</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>The error code (old).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time spent, in seconds.</p>
     */
    @NameInMap("Cost")
    public String cost;

    /**
     * <p>Indicates whether the resetting is successful.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error details.</p>
     */
    @NameInMap("ErrorDetail")
    public ResetOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

    /**
     * <p>The error description (old).</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total count, which takes effect in a pagination query.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ResetOmsOpenAPIProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetOmsOpenAPIProjectResponseBody self = new ResetOmsOpenAPIProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetOmsOpenAPIProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ResetOmsOpenAPIProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResetOmsOpenAPIProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ResetOmsOpenAPIProjectResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ResetOmsOpenAPIProjectResponseBody setErrorDetail(ResetOmsOpenAPIProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ResetOmsOpenAPIProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ResetOmsOpenAPIProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResetOmsOpenAPIProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ResetOmsOpenAPIProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ResetOmsOpenAPIProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetOmsOpenAPIProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ResetOmsOpenAPIProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ResetOmsOpenAPIProjectResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The error code (new).</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error level. Valid values: CRITICAL, ERROR, and WARN.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The error description (new).</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The suggestions (new).</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        public static ResetOmsOpenAPIProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ResetOmsOpenAPIProjectResponseBodyErrorDetail self = new ResetOmsOpenAPIProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ResetOmsOpenAPIProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ResetOmsOpenAPIProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ResetOmsOpenAPIProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ResetOmsOpenAPIProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
