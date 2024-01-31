// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHoneypotProbeResponseBody body;

    public static GetHoneypotProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotProbeResponse self = new GetHoneypotProbeResponse();
        return TeaModel.build(map, self);
    }

    public GetHoneypotProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoneypotProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoneypotProbeResponse setBody(GetHoneypotProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoneypotProbeResponseBody getBody() {
        return this.body;
    }

}
