// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListOutboundCallRestrictionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOutboundCallRestrictionsResponseBody body;

    public static ListOutboundCallRestrictionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundCallRestrictionsResponse self = new ListOutboundCallRestrictionsResponse();
        return TeaModel.build(map, self);
    }

    public ListOutboundCallRestrictionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOutboundCallRestrictionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOutboundCallRestrictionsResponse setBody(ListOutboundCallRestrictionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOutboundCallRestrictionsResponseBody getBody() {
        return this.body;
    }

}
