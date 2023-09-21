// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeUuidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHoneypotProbeUuidResponseBody body;

    public static ListHoneypotProbeUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotProbeUuidResponse self = new ListHoneypotProbeUuidResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotProbeUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotProbeUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotProbeUuidResponse setBody(ListHoneypotProbeUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotProbeUuidResponseBody getBody() {
        return this.body;
    }

}
