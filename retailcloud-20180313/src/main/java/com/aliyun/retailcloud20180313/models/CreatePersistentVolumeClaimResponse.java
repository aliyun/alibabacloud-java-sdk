// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreatePersistentVolumeClaimResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePersistentVolumeClaimResponseBody body;

    public static CreatePersistentVolumeClaimResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersistentVolumeClaimResponse self = new CreatePersistentVolumeClaimResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersistentVolumeClaimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersistentVolumeClaimResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersistentVolumeClaimResponse setBody(CreatePersistentVolumeClaimResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersistentVolumeClaimResponseBody getBody() {
        return this.body;
    }

}
