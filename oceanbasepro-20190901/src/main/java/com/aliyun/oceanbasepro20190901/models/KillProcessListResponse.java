// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class KillProcessListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public KillProcessListResponseBody body;

    public static KillProcessListResponse build(java.util.Map<String, ?> map) throws Exception {
        KillProcessListResponse self = new KillProcessListResponse();
        return TeaModel.build(map, self);
    }

    public KillProcessListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KillProcessListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public KillProcessListResponse setBody(KillProcessListResponseBody body) {
        this.body = body;
        return this;
    }
    public KillProcessListResponseBody getBody() {
        return this.body;
    }

}
