// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ConfirmVirusEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmVirusEventsResponseBody body;

    public static ConfirmVirusEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmVirusEventsResponse self = new ConfirmVirusEventsResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmVirusEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmVirusEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmVirusEventsResponse setBody(ConfirmVirusEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmVirusEventsResponseBody getBody() {
        return this.body;
    }

}
