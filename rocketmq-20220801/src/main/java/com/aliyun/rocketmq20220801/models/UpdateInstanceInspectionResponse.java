// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceInspectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceInspectionResponseBody body;

    public static UpdateInstanceInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInspectionResponse self = new UpdateInstanceInspectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceInspectionResponse setBody(UpdateInstanceInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceInspectionResponseBody getBody() {
        return this.body;
    }

}
