// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSDscfgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDWSDscfgResponseBody body;

    public static CreateDWSDscfgResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSDscfgResponse self = new CreateDWSDscfgResponse();
        return TeaModel.build(map, self);
    }

    public CreateDWSDscfgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDWSDscfgResponse setBody(CreateDWSDscfgResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDWSDscfgResponseBody getBody() {
        return this.body;
    }

}
