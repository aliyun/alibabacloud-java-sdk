// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class HotUpdateJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotUpdateJobResponseBody body;

    public static HotUpdateJobResponse build(java.util.Map<String, ?> map) throws Exception {
        HotUpdateJobResponse self = new HotUpdateJobResponse();
        return TeaModel.build(map, self);
    }

    public HotUpdateJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotUpdateJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotUpdateJobResponse setBody(HotUpdateJobResponseBody body) {
        this.body = body;
        return this;
    }
    public HotUpdateJobResponseBody getBody() {
        return this.body;
    }

}
