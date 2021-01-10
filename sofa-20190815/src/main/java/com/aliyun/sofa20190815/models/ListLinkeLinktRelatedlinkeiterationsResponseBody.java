// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktRelatedlinkeiterationsResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeLinktRelatedlinkeiterationsResponseBodyData> data;

    public static ListLinkeLinktRelatedlinkeiterationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktRelatedlinkeiterationsResponseBody self = new ListLinkeLinktRelatedlinkeiterationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktRelatedlinkeiterationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinktRelatedlinkeiterationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinktRelatedlinkeiterationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinktRelatedlinkeiterationsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ListLinkeLinktRelatedlinkeiterationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeLinktRelatedlinkeiterationsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinktRelatedlinkeiterationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinktRelatedlinkeiterationsResponseBody setData(java.util.List<ListLinkeLinktRelatedlinkeiterationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkeLinktRelatedlinkeiterationsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkeLinktRelatedlinkeiterationsResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Label")
        public String label;

        @NameInMap("Url")
        public String url;

        public static ListLinkeLinktRelatedlinkeiterationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinktRelatedlinkeiterationsResponseBodyData self = new ListLinkeLinktRelatedlinkeiterationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinktRelatedlinkeiterationsResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLinkeLinktRelatedlinkeiterationsResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListLinkeLinktRelatedlinkeiterationsResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
