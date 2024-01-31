// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHoneypotProbeResponseBody body;

    public static UpdateHoneypotProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotProbeResponse self = new UpdateHoneypotProbeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHoneypotProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHoneypotProbeResponse setBody(UpdateHoneypotProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHoneypotProbeResponseBody getBody() {
        return this.body;
    }

}
