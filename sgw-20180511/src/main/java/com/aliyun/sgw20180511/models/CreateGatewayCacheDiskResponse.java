// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayCacheDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGatewayCacheDiskResponseBody body;

    public static CreateGatewayCacheDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayCacheDiskResponse self = new CreateGatewayCacheDiskResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayCacheDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayCacheDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewayCacheDiskResponse setBody(CreateGatewayCacheDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayCacheDiskResponseBody getBody() {
        return this.body;
    }

}
