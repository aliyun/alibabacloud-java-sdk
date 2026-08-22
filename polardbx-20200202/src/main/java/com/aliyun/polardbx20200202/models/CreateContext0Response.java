// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateContext0Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContext0ResponseBody body;

    public static CreateContext0Response build(java.util.Map<String, ?> map) throws Exception {
        CreateContext0Response self = new CreateContext0Response();
        return TeaModel.build(map, self);
    }

    public CreateContext0Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContext0Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContext0Response setBody(CreateContext0ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContext0ResponseBody getBody() {
        return this.body;
    }

}
