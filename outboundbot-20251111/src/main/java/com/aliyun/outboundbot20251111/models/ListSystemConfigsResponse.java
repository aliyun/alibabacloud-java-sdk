// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListSystemConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSystemConfigsResponseBody body;

    public static ListSystemConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemConfigsResponse self = new ListSystemConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemConfigsResponse setBody(ListSystemConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemConfigsResponseBody getBody() {
        return this.body;
    }

}
