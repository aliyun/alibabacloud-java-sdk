// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateSystemConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSystemConfigsResponseBody body;

    public static UpdateSystemConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSystemConfigsResponse self = new UpdateSystemConfigsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSystemConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSystemConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSystemConfigsResponse setBody(UpdateSystemConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSystemConfigsResponseBody getBody() {
        return this.body;
    }

}
