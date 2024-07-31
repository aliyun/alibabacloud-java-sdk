// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateDiskAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDiskAttributeResponseBody body;

    public static UpdateDiskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiskAttributeResponse self = new UpdateDiskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDiskAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDiskAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDiskAttributeResponse setBody(UpdateDiskAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDiskAttributeResponseBody getBody() {
        return this.body;
    }

}
