// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateSecurityIpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSecurityIpGroupResponseBody body;

    public static CreateSecurityIpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIpGroupResponse self = new CreateSecurityIpGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSecurityIpGroupResponse setBody(CreateSecurityIpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

}
