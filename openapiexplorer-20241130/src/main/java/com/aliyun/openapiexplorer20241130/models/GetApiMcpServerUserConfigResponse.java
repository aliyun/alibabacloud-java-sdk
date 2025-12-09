// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetApiMcpServerUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiMcpServerUserConfigResponseBody body;

    public static GetApiMcpServerUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiMcpServerUserConfigResponse self = new GetApiMcpServerUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetApiMcpServerUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiMcpServerUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiMcpServerUserConfigResponse setBody(GetApiMcpServerUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiMcpServerUserConfigResponseBody getBody() {
        return this.body;
    }

}
