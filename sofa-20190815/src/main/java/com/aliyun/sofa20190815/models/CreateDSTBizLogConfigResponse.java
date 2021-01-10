// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDSTBizLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDSTBizLogConfigResponseBody body;

    public static CreateDSTBizLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDSTBizLogConfigResponse self = new CreateDSTBizLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateDSTBizLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDSTBizLogConfigResponse setBody(CreateDSTBizLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDSTBizLogConfigResponseBody getBody() {
        return this.body;
    }

}
