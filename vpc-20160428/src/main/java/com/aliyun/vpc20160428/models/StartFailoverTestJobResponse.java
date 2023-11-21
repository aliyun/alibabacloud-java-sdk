// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class StartFailoverTestJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartFailoverTestJobResponseBody body;

    public static StartFailoverTestJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StartFailoverTestJobResponse self = new StartFailoverTestJobResponse();
        return TeaModel.build(map, self);
    }

    public StartFailoverTestJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartFailoverTestJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartFailoverTestJobResponse setBody(StartFailoverTestJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StartFailoverTestJobResponseBody getBody() {
        return this.body;
    }

}
