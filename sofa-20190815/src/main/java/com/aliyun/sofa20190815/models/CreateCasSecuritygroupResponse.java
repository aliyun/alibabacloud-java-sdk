// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasSecuritygroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCasSecuritygroupResponseBody body;

    public static CreateCasSecuritygroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasSecuritygroupResponse self = new CreateCasSecuritygroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasSecuritygroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasSecuritygroupResponse setBody(CreateCasSecuritygroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasSecuritygroupResponseBody getBody() {
        return this.body;
    }

}
