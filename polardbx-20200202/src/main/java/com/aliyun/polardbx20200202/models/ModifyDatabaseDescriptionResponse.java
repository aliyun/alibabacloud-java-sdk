// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDatabaseDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDatabaseDescriptionResponseBody body;

    public static ModifyDatabaseDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseDescriptionResponse self = new ModifyDatabaseDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDatabaseDescriptionResponse setBody(ModifyDatabaseDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDatabaseDescriptionResponseBody getBody() {
        return this.body;
    }

}
