// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListOutboundCallNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOutboundCallNumbersResponseBody body;

    public static ListOutboundCallNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundCallNumbersResponse self = new ListOutboundCallNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ListOutboundCallNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOutboundCallNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOutboundCallNumbersResponse setBody(ListOutboundCallNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOutboundCallNumbersResponseBody getBody() {
        return this.body;
    }

}
