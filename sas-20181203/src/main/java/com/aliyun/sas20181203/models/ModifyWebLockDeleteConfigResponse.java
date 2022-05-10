// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockDeleteConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebLockDeleteConfigResponseBody body;

    public static ModifyWebLockDeleteConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockDeleteConfigResponse self = new ModifyWebLockDeleteConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockDeleteConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebLockDeleteConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebLockDeleteConfigResponse setBody(ModifyWebLockDeleteConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockDeleteConfigResponseBody getBody() {
        return this.body;
    }

}
