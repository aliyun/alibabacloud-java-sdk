// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleObjectScanEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleObjectScanEventResponseBody body;

    public static HandleObjectScanEventResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleObjectScanEventResponse self = new HandleObjectScanEventResponse();
        return TeaModel.build(map, self);
    }

    public HandleObjectScanEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleObjectScanEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleObjectScanEventResponse setBody(HandleObjectScanEventResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleObjectScanEventResponseBody getBody() {
        return this.body;
    }

}
