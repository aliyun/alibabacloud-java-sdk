// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListSmartAGApiUnsupportedFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSmartAGApiUnsupportedFeatureResponseBody body;

    public static ListSmartAGApiUnsupportedFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSmartAGApiUnsupportedFeatureResponse self = new ListSmartAGApiUnsupportedFeatureResponse();
        return TeaModel.build(map, self);
    }

    public ListSmartAGApiUnsupportedFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSmartAGApiUnsupportedFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSmartAGApiUnsupportedFeatureResponse setBody(ListSmartAGApiUnsupportedFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSmartAGApiUnsupportedFeatureResponseBody getBody() {
        return this.body;
    }

}
