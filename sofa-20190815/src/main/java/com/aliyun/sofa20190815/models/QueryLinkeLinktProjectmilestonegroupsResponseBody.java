// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectmilestonegroupsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinktProjectmilestonegroupsResponseBodyData> data;

    public static QueryLinkeLinktProjectmilestonegroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectmilestonegroupsResponseBody self = new QueryLinkeLinktProjectmilestonegroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectmilestonegroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktProjectmilestonegroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktProjectmilestonegroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktProjectmilestonegroupsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktProjectmilestonegroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktProjectmilestonegroupsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktProjectmilestonegroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktProjectmilestonegroupsResponseBody setData(java.util.List<QueryLinkeLinktProjectmilestonegroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkeLinktProjectmilestonegroupsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkeLinktProjectmilestonegroupsResponseBodyData extends TeaModel {
        @NameInMap("ExpectEndDate")
        public Long expectEndDate;

        @NameInMap("Items")
        public java.util.List<String> items;

        public static QueryLinkeLinktProjectmilestonegroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktProjectmilestonegroupsResponseBodyData self = new QueryLinkeLinktProjectmilestonegroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktProjectmilestonegroupsResponseBodyData setExpectEndDate(Long expectEndDate) {
            this.expectEndDate = expectEndDate;
            return this;
        }
        public Long getExpectEndDate() {
            return this.expectEndDate;
        }

        public QueryLinkeLinktProjectmilestonegroupsResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
