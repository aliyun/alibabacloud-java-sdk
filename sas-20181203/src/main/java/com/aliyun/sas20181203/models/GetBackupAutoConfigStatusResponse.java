// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBackupAutoConfigStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBackupAutoConfigStatusResponseBody body;

    public static GetBackupAutoConfigStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBackupAutoConfigStatusResponse self = new GetBackupAutoConfigStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetBackupAutoConfigStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBackupAutoConfigStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBackupAutoConfigStatusResponse setBody(GetBackupAutoConfigStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackupAutoConfigStatusResponseBody getBody() {
        return this.body;
    }

}
