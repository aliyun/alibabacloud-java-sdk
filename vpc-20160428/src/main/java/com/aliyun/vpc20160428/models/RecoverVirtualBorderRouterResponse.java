// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RecoverVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecoverVirtualBorderRouterResponseBody body;

    public static RecoverVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverVirtualBorderRouterResponse self = new RecoverVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public RecoverVirtualBorderRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverVirtualBorderRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverVirtualBorderRouterResponse setBody(RecoverVirtualBorderRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

}
