// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DesignateWorkersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DesignateWorkersResponseBody body;

    public static DesignateWorkersResponse build(java.util.Map<String, ?> map) throws Exception {
        DesignateWorkersResponse self = new DesignateWorkersResponse();
        return TeaModel.build(map, self);
    }

    public DesignateWorkersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DesignateWorkersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DesignateWorkersResponse setBody(DesignateWorkersResponseBody body) {
        this.body = body;
        return this;
    }
    public DesignateWorkersResponseBody getBody() {
        return this.body;
    }

}
