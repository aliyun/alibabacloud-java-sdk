// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CreateVCUInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVCUInstanceResponseBody body;

    public static CreateVCUInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVCUInstanceResponse self = new CreateVCUInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateVCUInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVCUInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVCUInstanceResponse setBody(CreateVCUInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVCUInstanceResponseBody getBody() {
        return this.body;
    }

}
