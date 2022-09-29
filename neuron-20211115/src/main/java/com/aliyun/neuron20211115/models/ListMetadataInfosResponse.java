// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMetadataInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMetadataInfosResponseBody body;

    public static ListMetadataInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetadataInfosResponse self = new ListMetadataInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListMetadataInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetadataInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetadataInfosResponse setBody(ListMetadataInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetadataInfosResponseBody getBody() {
        return this.body;
    }

}
