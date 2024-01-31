// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHoneypotProbeResponseBody body;

    public static CreateHoneypotProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotProbeResponse self = new CreateHoneypotProbeResponse();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHoneypotProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHoneypotProbeResponse setBody(CreateHoneypotProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHoneypotProbeResponseBody getBody() {
        return this.body;
    }

}
