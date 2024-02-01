// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class StopFailoverTestJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopFailoverTestJobResponseBody body;

    public static StopFailoverTestJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopFailoverTestJobResponse self = new StopFailoverTestJobResponse();
        return TeaModel.build(map, self);
    }

    public StopFailoverTestJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopFailoverTestJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopFailoverTestJobResponse setBody(StopFailoverTestJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopFailoverTestJobResponseBody getBody() {
        return this.body;
    }

}
