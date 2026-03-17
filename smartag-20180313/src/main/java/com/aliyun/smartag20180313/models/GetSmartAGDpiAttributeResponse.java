// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetSmartAGDpiAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmartAGDpiAttributeResponseBody body;

    public static GetSmartAGDpiAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmartAGDpiAttributeResponse self = new GetSmartAGDpiAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetSmartAGDpiAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmartAGDpiAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmartAGDpiAttributeResponse setBody(GetSmartAGDpiAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmartAGDpiAttributeResponseBody getBody() {
        return this.body;
    }

}
