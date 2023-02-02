// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsOpenAPIProjectResponseBody extends TeaModel {
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
     * <p>The time spent in processing the request, in seconds.</p>
     */
    @NameInMap("Cost")
    public String cost;

    /**
     * <p>The project creation details.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error details.</p>
     */
    @NameInMap("ErrorDetail")
    public CreateOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

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

    public static CreateOmsOpenAPIProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsOpenAPIProjectResponseBody self = new CreateOmsOpenAPIProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOmsOpenAPIProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public CreateOmsOpenAPIProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOmsOpenAPIProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public CreateOmsOpenAPIProjectResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateOmsOpenAPIProjectResponseBody setErrorDetail(CreateOmsOpenAPIProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public CreateOmsOpenAPIProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public CreateOmsOpenAPIProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOmsOpenAPIProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CreateOmsOpenAPIProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateOmsOpenAPIProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOmsOpenAPIProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOmsOpenAPIProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class CreateOmsOpenAPIProjectResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The error code (new).</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Valid values: CRITICAL, ERROR, and WARN.</p>
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

        public static CreateOmsOpenAPIProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateOmsOpenAPIProjectResponseBodyErrorDetail self = new CreateOmsOpenAPIProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public CreateOmsOpenAPIProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateOmsOpenAPIProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public CreateOmsOpenAPIProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateOmsOpenAPIProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
