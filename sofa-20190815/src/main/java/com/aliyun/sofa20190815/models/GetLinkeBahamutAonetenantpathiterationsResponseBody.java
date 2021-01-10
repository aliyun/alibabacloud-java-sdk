// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAonetenantpathiterationsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutAonetenantpathiterationsResponseBodyResults> results;

    public static GetLinkeBahamutAonetenantpathiterationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAonetenantpathiterationsResponseBody self = new GetLinkeBahamutAonetenantpathiterationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAonetenantpathiterationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAonetenantpathiterationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAonetenantpathiterationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAonetenantpathiterationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLinkeBahamutAonetenantpathiterationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAonetenantpathiterationsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAonetenantpathiterationsResponseBody setResults(java.util.List<GetLinkeBahamutAonetenantpathiterationsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<GetLinkeBahamutAonetenantpathiterationsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class GetLinkeBahamutAonetenantpathiterationsResponseBodyResults extends TeaModel {
        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        @NameInMap("Value")
        public String value;

        public static GetLinkeBahamutAonetenantpathiterationsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAonetenantpathiterationsResponseBodyResults self = new GetLinkeBahamutAonetenantpathiterationsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAonetenantpathiterationsResponseBodyResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetLinkeBahamutAonetenantpathiterationsResponseBodyResults setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLinkeBahamutAonetenantpathiterationsResponseBodyResults setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
