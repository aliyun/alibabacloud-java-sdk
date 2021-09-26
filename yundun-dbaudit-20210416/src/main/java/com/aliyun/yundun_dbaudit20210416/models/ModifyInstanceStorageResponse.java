// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class ModifyInstanceStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceStorageResponseBody body;

    public static ModifyInstanceStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStorageResponse self = new ModifyInstanceStorageResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceStorageResponse setBody(ModifyInstanceStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceStorageResponseBody getBody() {
        return this.body;
    }

}
