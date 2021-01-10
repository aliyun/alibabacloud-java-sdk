// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktMyparticipatedprojectsResponseBody extends TeaModel {
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
    public QueryLinkeLinktMyparticipatedprojectsResponseBodyData data;

    public static QueryLinkeLinktMyparticipatedprojectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktMyparticipatedprojectsResponseBody self = new QueryLinkeLinktMyparticipatedprojectsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktMyparticipatedprojectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktMyparticipatedprojectsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktMyparticipatedprojectsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktMyparticipatedprojectsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktMyparticipatedprojectsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktMyparticipatedprojectsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktMyparticipatedprojectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktMyparticipatedprojectsResponseBody setData(QueryLinkeLinktMyparticipatedprojectsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktMyparticipatedprojectsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktMyparticipatedprojectsResponseBodyData extends TeaModel {
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

        public static QueryLinkeLinktMyparticipatedprojectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktMyparticipatedprojectsResponseBodyData self = new QueryLinkeLinktMyparticipatedprojectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktMyparticipatedprojectsResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryLinkeLinktMyparticipatedprojectsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryLinkeLinktMyparticipatedprojectsResponseBodyData setPageTotal(Long pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Long getPageTotal() {
            return this.pageTotal;
        }

        public QueryLinkeLinktMyparticipatedprojectsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLinkeLinktMyparticipatedprojectsResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
