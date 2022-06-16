// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeletePersistentVolumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePersistentVolumeResponseBody body;

    public static DeletePersistentVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePersistentVolumeResponse self = new DeletePersistentVolumeResponse();
        return TeaModel.build(map, self);
    }

    public DeletePersistentVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePersistentVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePersistentVolumeResponse setBody(DeletePersistentVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePersistentVolumeResponseBody getBody() {
        return this.body;
    }

}
