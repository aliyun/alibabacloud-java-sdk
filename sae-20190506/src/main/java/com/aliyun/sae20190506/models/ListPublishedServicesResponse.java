// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListPublishedServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublishedServicesResponseBody body;

    public static ListPublishedServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedServicesResponse self = new ListPublishedServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishedServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishedServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishedServicesResponse setBody(ListPublishedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishedServicesResponseBody getBody() {
        return this.body;
    }

}
