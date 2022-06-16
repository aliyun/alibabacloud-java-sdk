// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListPersistentVolumeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPersistentVolumeResponseBody body;

    public static ListPersistentVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersistentVolumeResponse self = new ListPersistentVolumeResponse();
        return TeaModel.build(map, self);
    }

    public ListPersistentVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersistentVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPersistentVolumeResponse setBody(ListPersistentVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersistentVolumeResponseBody getBody() {
        return this.body;
    }

}
