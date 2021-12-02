// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreatePersistentVolumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePersistentVolumeResponseBody body;

    public static CreatePersistentVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersistentVolumeResponse self = new CreatePersistentVolumeResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersistentVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersistentVolumeResponse setBody(CreatePersistentVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersistentVolumeResponseBody getBody() {
        return this.body;
    }

}
