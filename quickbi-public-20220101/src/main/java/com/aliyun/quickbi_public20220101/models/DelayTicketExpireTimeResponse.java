// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DelayTicketExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelayTicketExpireTimeResponseBody body;

    public static DelayTicketExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DelayTicketExpireTimeResponse self = new DelayTicketExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public DelayTicketExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelayTicketExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelayTicketExpireTimeResponse setBody(DelayTicketExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DelayTicketExpireTimeResponseBody getBody() {
        return this.body;
    }

}
