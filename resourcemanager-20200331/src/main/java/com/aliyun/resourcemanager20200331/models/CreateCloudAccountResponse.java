// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateCloudAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudAccountResponseBody body;

    public static CreateCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudAccountResponse self = new CreateCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudAccountResponse setBody(CreateCloudAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudAccountResponseBody getBody() {
        return this.body;
    }

}
