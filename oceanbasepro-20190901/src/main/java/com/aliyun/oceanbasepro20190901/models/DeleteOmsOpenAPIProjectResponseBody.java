// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOmsOpenAPIProjectResponseBody extends TeaModel {
    /**
     * <p>You can call this operation to delete a data synchronization project.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>Indicates whether the project has been deleted.</p>
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
    public DeleteOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

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

    public static DeleteOmsOpenAPIProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOmsOpenAPIProjectResponseBody self = new DeleteOmsOpenAPIProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOmsOpenAPIProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DeleteOmsOpenAPIProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteOmsOpenAPIProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DeleteOmsOpenAPIProjectResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteOmsOpenAPIProjectResponseBody setErrorDetail(DeleteOmsOpenAPIProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DeleteOmsOpenAPIProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DeleteOmsOpenAPIProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteOmsOpenAPIProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DeleteOmsOpenAPIProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DeleteOmsOpenAPIProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteOmsOpenAPIProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteOmsOpenAPIProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DeleteOmsOpenAPIProjectResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to **DeleteOmsOpenAPIProject**.</p>
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

        public static DeleteOmsOpenAPIProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DeleteOmsOpenAPIProjectResponseBodyErrorDetail self = new DeleteOmsOpenAPIProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DeleteOmsOpenAPIProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteOmsOpenAPIProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DeleteOmsOpenAPIProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteOmsOpenAPIProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
