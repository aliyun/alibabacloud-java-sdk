// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppssearchliteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public QueryLinkeBahamutAppssearchliteResponseBodyResult result;

    public static QueryLinkeBahamutAppssearchliteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppssearchliteResponseBody self = new QueryLinkeBahamutAppssearchliteResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAppssearchliteResponseBody setResult(QueryLinkeBahamutAppssearchliteResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutAppssearchliteResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAppssearchliteResponseBodyResult extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Data")
        public java.util.List<String> data;

        public static QueryLinkeBahamutAppssearchliteResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAppssearchliteResponseBodyResult self = new QueryLinkeBahamutAppssearchliteResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAppssearchliteResponseBodyResult setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryLinkeBahamutAppssearchliteResponseBodyResult setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutAppssearchliteResponseBodyResult setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public QueryLinkeBahamutAppssearchliteResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryLinkeBahamutAppssearchliteResponseBodyResult setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}
