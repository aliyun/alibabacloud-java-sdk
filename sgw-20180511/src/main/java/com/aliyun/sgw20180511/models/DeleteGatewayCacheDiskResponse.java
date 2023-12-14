// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteGatewayCacheDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayCacheDiskResponseBody body;

    public static DeleteGatewayCacheDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayCacheDiskResponse self = new DeleteGatewayCacheDiskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayCacheDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayCacheDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayCacheDiskResponse setBody(DeleteGatewayCacheDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayCacheDiskResponseBody getBody() {
        return this.body;
    }

}
