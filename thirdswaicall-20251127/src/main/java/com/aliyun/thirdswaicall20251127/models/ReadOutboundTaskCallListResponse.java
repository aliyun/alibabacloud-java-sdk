// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class ReadOutboundTaskCallListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadOutboundTaskCallListResponseBody body;

    public static ReadOutboundTaskCallListResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadOutboundTaskCallListResponse self = new ReadOutboundTaskCallListResponse();
        return TeaModel.build(map, self);
    }

    public ReadOutboundTaskCallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadOutboundTaskCallListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadOutboundTaskCallListResponse setBody(ReadOutboundTaskCallListResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadOutboundTaskCallListResponseBody getBody() {
        return this.body;
    }

}
