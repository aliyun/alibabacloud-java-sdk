// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResetOmsOpenAPIProjectResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ErrorDetail")
    public ResetOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

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
