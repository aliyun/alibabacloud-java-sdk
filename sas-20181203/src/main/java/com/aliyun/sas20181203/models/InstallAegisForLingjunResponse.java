// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallAegisForLingjunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallAegisForLingjunResponseBody body;

    public static InstallAegisForLingjunResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallAegisForLingjunResponse self = new InstallAegisForLingjunResponse();
        return TeaModel.build(map, self);
    }

    public InstallAegisForLingjunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallAegisForLingjunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallAegisForLingjunResponse setBody(InstallAegisForLingjunResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallAegisForLingjunResponseBody getBody() {
        return this.body;
    }

}
