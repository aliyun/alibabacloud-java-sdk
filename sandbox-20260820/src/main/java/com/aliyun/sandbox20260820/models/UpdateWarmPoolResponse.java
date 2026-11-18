// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateWarmPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWarmPoolResponseBody body;

    public static UpdateWarmPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWarmPoolResponse self = new UpdateWarmPoolResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWarmPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWarmPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWarmPoolResponse setBody(UpdateWarmPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWarmPoolResponseBody getBody() {
        return this.body;
    }

}
