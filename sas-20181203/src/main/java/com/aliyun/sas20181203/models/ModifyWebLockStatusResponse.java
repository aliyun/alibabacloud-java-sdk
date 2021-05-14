// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyWebLockStatusResponseBody body;

    public static ModifyWebLockStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockStatusResponse self = new ModifyWebLockStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebLockStatusResponse setBody(ModifyWebLockStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebLockStatusResponseBody getBody() {
        return this.body;
    }

}
