// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUpdateConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebLockUpdateConfigResponseBody body;

    public static ModifyWebLockUpdateConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockUpdateConfigResponse self = new ModifyWebLockUpdateConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockUpdateConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebLockUpdateConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebLockUpdateConfigResponse setBody(ModifyWebLockUpdateConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockUpdateConfigResponseBody getBody() {
        return this.body;
    }

}
