// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class StartOrStopByPassShuntEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartOrStopByPassShuntEventResponseBody body;

    public static StartOrStopByPassShuntEventResponse build(java.util.Map<String, ?> map) throws Exception {
        StartOrStopByPassShuntEventResponse self = new StartOrStopByPassShuntEventResponse();
        return TeaModel.build(map, self);
    }

    public StartOrStopByPassShuntEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartOrStopByPassShuntEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartOrStopByPassShuntEventResponse setBody(StartOrStopByPassShuntEventResponseBody body) {
        this.body = body;
        return this;
    }
    public StartOrStopByPassShuntEventResponseBody getBody() {
        return this.body;
    }

}
