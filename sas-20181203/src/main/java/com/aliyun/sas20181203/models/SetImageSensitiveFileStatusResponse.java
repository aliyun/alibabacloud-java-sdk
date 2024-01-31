// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetImageSensitiveFileStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetImageSensitiveFileStatusResponseBody body;

    public static SetImageSensitiveFileStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetImageSensitiveFileStatusResponse self = new SetImageSensitiveFileStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetImageSensitiveFileStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetImageSensitiveFileStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetImageSensitiveFileStatusResponse setBody(SetImageSensitiveFileStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetImageSensitiveFileStatusResponseBody getBody() {
        return this.body;
    }

}
