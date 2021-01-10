// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RollbackLinkedeploycoreDeploycoreAppserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody body;

    public static RollbackLinkedeploycoreDeploycoreAppserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackLinkedeploycoreDeploycoreAppserviceResponse self = new RollbackLinkedeploycoreDeploycoreAppserviceResponse();
        return TeaModel.build(map, self);
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponse setBody(RollbackLinkedeploycoreDeploycoreAppserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody getBody() {
        return this.body;
    }

}
