// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateInstancePackageStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstancePackageStateResponseBody body;

    public static UpdateInstancePackageStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstancePackageStateResponse self = new UpdateInstancePackageStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstancePackageStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstancePackageStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstancePackageStateResponse setBody(UpdateInstancePackageStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstancePackageStateResponseBody getBody() {
        return this.body;
    }

}
