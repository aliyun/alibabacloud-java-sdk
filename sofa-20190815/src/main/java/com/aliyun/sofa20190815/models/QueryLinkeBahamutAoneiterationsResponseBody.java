// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneiterationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Results")
    public java.util.List<QueryLinkeBahamutAoneiterationsResponseBodyResults> results;

    public static QueryLinkeBahamutAoneiterationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneiterationsResponseBody self = new QueryLinkeBahamutAoneiterationsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneiterationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAoneiterationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAoneiterationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAoneiterationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLinkeBahamutAoneiterationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAoneiterationsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAoneiterationsResponseBody setResults(java.util.List<QueryLinkeBahamutAoneiterationsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<QueryLinkeBahamutAoneiterationsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class QueryLinkeBahamutAoneiterationsResponseBodyResults extends TeaModel {
        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        @NameInMap("Value")
        public String value;

        public static QueryLinkeBahamutAoneiterationsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAoneiterationsResponseBodyResults self = new QueryLinkeBahamutAoneiterationsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAoneiterationsResponseBodyResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryLinkeBahamutAoneiterationsResponseBodyResults setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryLinkeBahamutAoneiterationsResponseBodyResults setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
