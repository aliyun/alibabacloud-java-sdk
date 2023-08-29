// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListFeatureEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFeatureEntitiesResponseBody body;

    public static ListFeatureEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureEntitiesResponse self = new ListFeatureEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureEntitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureEntitiesResponse setBody(ListFeatureEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureEntitiesResponseBody getBody() {
        return this.body;
    }

}
