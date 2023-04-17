// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListResourcesForTagOptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourcesForTagOptionResponseBody body;

    public static ListResourcesForTagOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesForTagOptionResponse self = new ListResourcesForTagOptionResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcesForTagOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcesForTagOptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourcesForTagOptionResponse setBody(ListResourcesForTagOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcesForTagOptionResponseBody getBody() {
        return this.body;
    }

}
