// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceTypesResponseBody body;

    public static ListResourceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponse self = new ListResourceTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceTypesResponse setBody(ListResourceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceTypesResponseBody getBody() {
        return this.body;
    }

}
