// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeaturesResponseBody body;

    public static ListFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeaturesResponse self = new ListFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeaturesResponse setBody(ListFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeaturesResponseBody getBody() {
        return this.body;
    }

}
