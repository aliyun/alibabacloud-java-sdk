// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class StopOmsOpenAPIProjectResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the project is paused.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>A system error occurred.</p>
     */
    @NameInMap("ErrorDetail")
    public StopOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pause a data synchronization project</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A system error occurred.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static StopOmsOpenAPIProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopOmsOpenAPIProjectResponseBody self = new StopOmsOpenAPIProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public StopOmsOpenAPIProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public StopOmsOpenAPIProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopOmsOpenAPIProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public StopOmsOpenAPIProjectResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public StopOmsOpenAPIProjectResponseBody setErrorDetail(StopOmsOpenAPIProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public StopOmsOpenAPIProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public StopOmsOpenAPIProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopOmsOpenAPIProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public StopOmsOpenAPIProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public StopOmsOpenAPIProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopOmsOpenAPIProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StopOmsOpenAPIProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class StopOmsOpenAPIProjectResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The time spent in processing the request, in seconds.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error code (old).</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The project ID.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The error description (new).</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        public static StopOmsOpenAPIProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            StopOmsOpenAPIProjectResponseBodyErrorDetail self = new StopOmsOpenAPIProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public StopOmsOpenAPIProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public StopOmsOpenAPIProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public StopOmsOpenAPIProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopOmsOpenAPIProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
