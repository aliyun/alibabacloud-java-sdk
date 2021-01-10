// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktLinkeiterationsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinktLinkeiterationsResponseBodyData> data;

    public static QueryLinkeLinktLinkeiterationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktLinkeiterationsResponseBody self = new QueryLinkeLinktLinkeiterationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktLinkeiterationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktLinkeiterationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktLinkeiterationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktLinkeiterationsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktLinkeiterationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktLinkeiterationsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktLinkeiterationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktLinkeiterationsResponseBody setData(java.util.List<QueryLinkeLinktLinkeiterationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkeLinktLinkeiterationsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkeLinktLinkeiterationsResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Label")
        public String label;

        @NameInMap("Url")
        public String url;

        public static QueryLinkeLinktLinkeiterationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktLinkeiterationsResponseBodyData self = new QueryLinkeLinktLinkeiterationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktLinkeiterationsResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLinkeLinktLinkeiterationsResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryLinkeLinktLinkeiterationsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
