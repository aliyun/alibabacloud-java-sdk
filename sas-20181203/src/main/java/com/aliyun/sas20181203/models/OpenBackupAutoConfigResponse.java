// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenBackupAutoConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenBackupAutoConfigResponseBody body;

    public static OpenBackupAutoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenBackupAutoConfigResponse self = new OpenBackupAutoConfigResponse();
        return TeaModel.build(map, self);
    }

    public OpenBackupAutoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenBackupAutoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenBackupAutoConfigResponse setBody(OpenBackupAutoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenBackupAutoConfigResponseBody getBody() {
        return this.body;
    }

}
