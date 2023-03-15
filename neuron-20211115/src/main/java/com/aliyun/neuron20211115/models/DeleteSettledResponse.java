// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeleteSettledResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CommonResult body;

    public static DeleteSettledResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSettledResponse self = new DeleteSettledResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSettledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSettledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSettledResponse setBody(CommonResult body) {
        this.body = body;
        return this;
    }
    public CommonResult getBody() {
        return this.body;
    }

}
