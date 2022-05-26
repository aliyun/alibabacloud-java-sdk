// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshEditionPartiallyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeMeshEditionPartiallyResponseBody body;

    public static UpgradeMeshEditionPartiallyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMeshEditionPartiallyResponse self = new UpgradeMeshEditionPartiallyResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeMeshEditionPartiallyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeMeshEditionPartiallyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeMeshEditionPartiallyResponse setBody(UpgradeMeshEditionPartiallyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeMeshEditionPartiallyResponseBody getBody() {
        return this.body;
    }

}
