// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasVpcVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCasVpcVSwitchResponseBody body;

    public static CreateCasVpcVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasVpcVSwitchResponse self = new CreateCasVpcVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasVpcVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasVpcVSwitchResponse setBody(CreateCasVpcVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasVpcVSwitchResponseBody getBody() {
        return this.body;
    }

}
