// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class GetServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Service body;

    public static GetServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponse self = new GetServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceResponse setBody(Service body) {
        this.body = body;
        return this;
    }
    public Service getBody() {
        return this.body;
    }

}
