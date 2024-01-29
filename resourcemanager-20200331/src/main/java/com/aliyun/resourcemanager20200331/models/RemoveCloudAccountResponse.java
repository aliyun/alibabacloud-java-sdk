// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RemoveCloudAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveCloudAccountResponseBody body;

    public static RemoveCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCloudAccountResponse self = new RemoveCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCloudAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveCloudAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveCloudAccountResponse setBody(RemoveCloudAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveCloudAccountResponseBody getBody() {
        return this.body;
    }

}
