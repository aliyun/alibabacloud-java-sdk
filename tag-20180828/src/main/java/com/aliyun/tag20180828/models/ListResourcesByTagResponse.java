// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListResourcesByTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourcesByTagResponseBody body;

    public static ListResourcesByTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByTagResponse self = new ListResourcesByTagResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcesByTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcesByTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourcesByTagResponse setBody(ListResourcesByTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcesByTagResponseBody getBody() {
        return this.body;
    }

}
