// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class DeltaGetLastCursorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeltaGetLastCursorResponseBody body;

    public static DeltaGetLastCursorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeltaGetLastCursorResponse self = new DeltaGetLastCursorResponse();
        return TeaModel.build(map, self);
    }

    public DeltaGetLastCursorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeltaGetLastCursorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeltaGetLastCursorResponse setBody(DeltaGetLastCursorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeltaGetLastCursorResponseBody getBody() {
        return this.body;
    }

}
