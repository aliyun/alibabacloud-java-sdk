// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListPersistentVolumeClaimResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPersistentVolumeClaimResponseBody body;

    public static ListPersistentVolumeClaimResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersistentVolumeClaimResponse self = new ListPersistentVolumeClaimResponse();
        return TeaModel.build(map, self);
    }

    public ListPersistentVolumeClaimResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersistentVolumeClaimResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPersistentVolumeClaimResponse setBody(ListPersistentVolumeClaimResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersistentVolumeClaimResponseBody getBody() {
        return this.body;
    }

}
