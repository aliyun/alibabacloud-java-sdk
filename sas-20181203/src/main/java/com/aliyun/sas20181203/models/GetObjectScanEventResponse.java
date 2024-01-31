// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetObjectScanEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetObjectScanEventResponseBody body;

    public static GetObjectScanEventResponse build(java.util.Map<String, ?> map) throws Exception {
        GetObjectScanEventResponse self = new GetObjectScanEventResponse();
        return TeaModel.build(map, self);
    }

    public GetObjectScanEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetObjectScanEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetObjectScanEventResponse setBody(GetObjectScanEventResponseBody body) {
        this.body = body;
        return this;
    }
    public GetObjectScanEventResponseBody getBody() {
        return this.body;
    }

}
