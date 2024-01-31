// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHoneypotProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHoneypotProbeResponseBody body;

    public static DeleteHoneypotProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHoneypotProbeResponse self = new DeleteHoneypotProbeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHoneypotProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHoneypotProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHoneypotProbeResponse setBody(DeleteHoneypotProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHoneypotProbeResponseBody getBody() {
        return this.body;
    }

}
