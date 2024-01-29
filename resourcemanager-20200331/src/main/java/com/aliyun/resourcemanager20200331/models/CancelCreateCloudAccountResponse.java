// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CancelCreateCloudAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCreateCloudAccountResponseBody body;

    public static CancelCreateCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCreateCloudAccountResponse self = new CancelCreateCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public CancelCreateCloudAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCreateCloudAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCreateCloudAccountResponse setBody(CancelCreateCloudAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCreateCloudAccountResponseBody getBody() {
        return this.body;
    }

}
