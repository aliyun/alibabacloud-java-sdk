// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class UpdateApiMcpServerUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApiMcpServerUserConfigResponseBody body;

    public static UpdateApiMcpServerUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiMcpServerUserConfigResponse self = new UpdateApiMcpServerUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApiMcpServerUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApiMcpServerUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApiMcpServerUserConfigResponse setBody(UpdateApiMcpServerUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApiMcpServerUserConfigResponseBody getBody() {
        return this.body;
    }

}
