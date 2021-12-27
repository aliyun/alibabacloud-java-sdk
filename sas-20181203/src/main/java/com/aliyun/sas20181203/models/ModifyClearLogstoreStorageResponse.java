// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClearLogstoreStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClearLogstoreStorageResponseBody body;

    public static ModifyClearLogstoreStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClearLogstoreStorageResponse self = new ModifyClearLogstoreStorageResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClearLogstoreStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClearLogstoreStorageResponse setBody(ModifyClearLogstoreStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClearLogstoreStorageResponseBody getBody() {
        return this.body;
    }

}
