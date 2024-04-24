// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceResponseBody body;

    public static UpdateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResponse self = new UpdateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceResponse setBody(UpdateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceResponseBody getBody() {
        return this.body;
    }

}
