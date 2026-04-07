// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateMem0Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMem0ResponseBody body;

    public static CreateMem0Response build(java.util.Map<String, ?> map) throws Exception {
        CreateMem0Response self = new CreateMem0Response();
        return TeaModel.build(map, self);
    }

    public CreateMem0Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMem0Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMem0Response setBody(CreateMem0ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMem0ResponseBody getBody() {
        return this.body;
    }

}
