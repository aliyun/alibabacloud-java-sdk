// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktIterationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkeLinktIterationsResponseBodyData data;

    public static QueryLinkeLinktIterationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktIterationsResponseBody self = new QueryLinkeLinktIterationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktIterationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktIterationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktIterationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktIterationsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktIterationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktIterationsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktIterationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktIterationsResponseBody setData(QueryLinkeLinktIterationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktIterationsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktIterationsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("PageTotal")
        public Long pageTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Items")
        public java.util.List<String> items;

        public static QueryLinkeLinktIterationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktIterationsResponseBodyData self = new QueryLinkeLinktIterationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktIterationsResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryLinkeLinktIterationsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryLinkeLinktIterationsResponseBodyData setPageTotal(Long pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Long getPageTotal() {
            return this.pageTotal;
        }

        public QueryLinkeLinktIterationsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLinkeLinktIterationsResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
