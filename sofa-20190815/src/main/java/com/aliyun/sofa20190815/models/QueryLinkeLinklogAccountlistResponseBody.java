// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinklogAccountlistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public QueryLinkeLinklogAccountlistResponseBodyResult result;

    public static QueryLinkeLinklogAccountlistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinklogAccountlistResponseBody self = new QueryLinkeLinklogAccountlistResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinklogAccountlistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinklogAccountlistResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinklogAccountlistResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinklogAccountlistResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinklogAccountlistResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public QueryLinkeLinklogAccountlistResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public QueryLinkeLinklogAccountlistResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinklogAccountlistResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinklogAccountlistResponseBody setResult(QueryLinkeLinklogAccountlistResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeLinklogAccountlistResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeLinklogAccountlistResponseBodyResult extends TeaModel {
        @NameInMap("Pagination")
        public String pagination;

        @NameInMap("List")
        public java.util.List<String> list;

        public static QueryLinkeLinklogAccountlistResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinklogAccountlistResponseBodyResult self = new QueryLinkeLinklogAccountlistResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinklogAccountlistResponseBodyResult setPagination(String pagination) {
            this.pagination = pagination;
            return this;
        }
        public String getPagination() {
            return this.pagination;
        }

        public QueryLinkeLinklogAccountlistResponseBodyResult setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

    }

}
