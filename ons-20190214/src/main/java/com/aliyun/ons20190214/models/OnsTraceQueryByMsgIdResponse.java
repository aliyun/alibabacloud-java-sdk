// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceQueryByMsgIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTraceQueryByMsgIdResponseBody body;

    public static OnsTraceQueryByMsgIdResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceQueryByMsgIdResponse self = new OnsTraceQueryByMsgIdResponse();
        return TeaModel.build(map, self);
    }

    public OnsTraceQueryByMsgIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTraceQueryByMsgIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsTraceQueryByMsgIdResponse setBody(OnsTraceQueryByMsgIdResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTraceQueryByMsgIdResponseBody getBody() {
        return this.body;
    }

}
