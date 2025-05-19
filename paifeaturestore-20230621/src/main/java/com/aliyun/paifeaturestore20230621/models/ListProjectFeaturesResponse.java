// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectFeaturesResponseBody body;

    public static ListProjectFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeaturesResponse self = new ListProjectFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectFeaturesResponse setBody(ListProjectFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectFeaturesResponseBody getBody() {
        return this.body;
    }

}
