// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class StartHotlineWorkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartHotlineWorkResponseBody body;

    public static StartHotlineWorkResponse build(java.util.Map<String, ?> map) throws Exception {
        StartHotlineWorkResponse self = new StartHotlineWorkResponse();
        return TeaModel.build(map, self);
    }

    public StartHotlineWorkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartHotlineWorkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartHotlineWorkResponse setBody(StartHotlineWorkResponseBody body) {
        this.body = body;
        return this;
    }
    public StartHotlineWorkResponseBody getBody() {
        return this.body;
    }

}
