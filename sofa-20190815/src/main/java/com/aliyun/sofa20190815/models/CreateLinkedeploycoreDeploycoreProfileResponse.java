// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkedeploycoreDeploycoreProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkedeploycoreDeploycoreProfileResponseBody body;

    public static CreateLinkedeploycoreDeploycoreProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkedeploycoreDeploycoreProfileResponse self = new CreateLinkedeploycoreDeploycoreProfileResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkedeploycoreDeploycoreProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkedeploycoreDeploycoreProfileResponse setBody(CreateLinkedeploycoreDeploycoreProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkedeploycoreDeploycoreProfileResponseBody getBody() {
        return this.body;
    }

}
