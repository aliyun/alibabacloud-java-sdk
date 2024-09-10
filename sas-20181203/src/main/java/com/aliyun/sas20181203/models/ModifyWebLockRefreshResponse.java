// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockRefreshResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebLockRefreshResponseBody body;

    public static ModifyWebLockRefreshResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockRefreshResponse self = new ModifyWebLockRefreshResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockRefreshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebLockRefreshResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebLockRefreshResponse setBody(ModifyWebLockRefreshResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockRefreshResponseBody getBody() {
        return this.body;
    }

}
