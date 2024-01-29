// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListModelFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelFeaturesResponseBody body;

    public static ListModelFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelFeaturesResponse self = new ListModelFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListModelFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelFeaturesResponse setBody(ListModelFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelFeaturesResponseBody getBody() {
        return this.body;
    }

}
