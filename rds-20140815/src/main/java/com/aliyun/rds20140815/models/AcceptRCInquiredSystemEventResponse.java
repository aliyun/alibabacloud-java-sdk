// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AcceptRCInquiredSystemEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AcceptRCInquiredSystemEventResponseBody body;

    public static AcceptRCInquiredSystemEventResponse build(java.util.Map<String, ?> map) throws Exception {
        AcceptRCInquiredSystemEventResponse self = new AcceptRCInquiredSystemEventResponse();
        return TeaModel.build(map, self);
    }

    public AcceptRCInquiredSystemEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AcceptRCInquiredSystemEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AcceptRCInquiredSystemEventResponse setBody(AcceptRCInquiredSystemEventResponseBody body) {
        this.body = body;
        return this;
    }
    public AcceptRCInquiredSystemEventResponseBody getBody() {
        return this.body;
    }

}
