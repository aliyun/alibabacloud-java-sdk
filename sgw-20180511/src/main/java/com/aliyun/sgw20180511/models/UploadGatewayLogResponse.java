// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UploadGatewayLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadGatewayLogResponseBody body;

    public static UploadGatewayLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadGatewayLogResponse self = new UploadGatewayLogResponse();
        return TeaModel.build(map, self);
    }

    public UploadGatewayLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadGatewayLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadGatewayLogResponse setBody(UploadGatewayLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadGatewayLogResponseBody getBody() {
        return this.body;
    }

}
