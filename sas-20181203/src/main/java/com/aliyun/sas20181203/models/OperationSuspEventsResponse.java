// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationSuspEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperationSuspEventsResponseBody body;

    public static OperationSuspEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperationSuspEventsResponse self = new OperationSuspEventsResponse();
        return TeaModel.build(map, self);
    }

    public OperationSuspEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperationSuspEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperationSuspEventsResponse setBody(OperationSuspEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperationSuspEventsResponseBody getBody() {
        return this.body;
    }

}
