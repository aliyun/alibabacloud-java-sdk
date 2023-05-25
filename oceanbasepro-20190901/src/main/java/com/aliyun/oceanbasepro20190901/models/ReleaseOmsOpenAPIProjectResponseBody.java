// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReleaseOmsOpenAPIProjectResponseBody extends TeaModel {
    /**
     * <p>You can call this operation to release a data synchronization project.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>Indicates whether the project is released.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The suggestions (new).</p>
     */
    @NameInMap("ErrorDetail")
    public ReleaseOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

    /**
     * <p>A system error occurred.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ReleaseOmsOpenAPIProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseOmsOpenAPIProjectResponseBody self = new ReleaseOmsOpenAPIProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseOmsOpenAPIProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setErrorDetail(ReleaseOmsOpenAPIProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ReleaseOmsOpenAPIProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReleaseOmsOpenAPIProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ReleaseOmsOpenAPIProjectResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to **ReleaseOmsOpenAPIProject**.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error description (old).</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The error code (new).</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The page number, which takes effect in a pagination query.</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        public static ReleaseOmsOpenAPIProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ReleaseOmsOpenAPIProjectResponseBodyErrorDetail self = new ReleaseOmsOpenAPIProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ReleaseOmsOpenAPIProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ReleaseOmsOpenAPIProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ReleaseOmsOpenAPIProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ReleaseOmsOpenAPIProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
