// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockCreateConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebLockCreateConfigResponseBody body;

    public static ModifyWebLockCreateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockCreateConfigResponse self = new ModifyWebLockCreateConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockCreateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebLockCreateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebLockCreateConfigResponse setBody(ModifyWebLockCreateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockCreateConfigResponseBody getBody() {
        return this.body;
    }

}
