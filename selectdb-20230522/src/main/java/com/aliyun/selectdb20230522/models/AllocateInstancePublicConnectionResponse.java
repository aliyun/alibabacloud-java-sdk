// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AllocateInstancePublicConnectionResponseBody body;

    public static AllocateInstancePublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionResponse self = new AllocateInstancePublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateInstancePublicConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateInstancePublicConnectionResponse setBody(AllocateInstancePublicConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateInstancePublicConnectionResponseBody getBody() {
        return this.body;
    }

}
