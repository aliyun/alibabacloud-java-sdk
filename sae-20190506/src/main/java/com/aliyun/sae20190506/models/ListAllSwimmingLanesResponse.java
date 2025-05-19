// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAllSwimmingLanesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllSwimmingLanesResponseBody body;

    public static ListAllSwimmingLanesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllSwimmingLanesResponse self = new ListAllSwimmingLanesResponse();
        return TeaModel.build(map, self);
    }

    public ListAllSwimmingLanesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllSwimmingLanesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllSwimmingLanesResponse setBody(ListAllSwimmingLanesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllSwimmingLanesResponseBody getBody() {
        return this.body;
    }

}
