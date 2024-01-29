// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
