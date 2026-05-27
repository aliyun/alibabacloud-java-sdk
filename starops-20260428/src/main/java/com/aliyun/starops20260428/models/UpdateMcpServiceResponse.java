// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpdateMcpServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMcpServiceResponseBody body;

    public static UpdateMcpServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpServiceResponse self = new UpdateMcpServiceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMcpServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMcpServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMcpServiceResponse setBody(UpdateMcpServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcpServiceResponseBody getBody() {
        return this.body;
    }

}
