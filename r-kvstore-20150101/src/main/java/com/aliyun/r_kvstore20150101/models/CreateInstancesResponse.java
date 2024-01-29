// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstancesResponseBody body;

    public static CreateInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstancesResponse self = new CreateInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstancesResponse setBody(CreateInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstancesResponseBody getBody() {
        return this.body;
    }

}
