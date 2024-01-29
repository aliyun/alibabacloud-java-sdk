// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendCreateCloudAccountEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResendCreateCloudAccountEmailResponseBody body;

    public static ResendCreateCloudAccountEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendCreateCloudAccountEmailResponse self = new ResendCreateCloudAccountEmailResponse();
        return TeaModel.build(map, self);
    }

    public ResendCreateCloudAccountEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendCreateCloudAccountEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResendCreateCloudAccountEmailResponse setBody(ResendCreateCloudAccountEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendCreateCloudAccountEmailResponseBody getBody() {
        return this.body;
    }

}
