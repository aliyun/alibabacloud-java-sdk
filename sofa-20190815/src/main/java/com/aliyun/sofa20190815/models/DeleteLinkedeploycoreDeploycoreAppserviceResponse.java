// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkedeploycoreDeploycoreAppserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody body;

    public static DeleteLinkedeploycoreDeploycoreAppserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkedeploycoreDeploycoreAppserviceResponse self = new DeleteLinkedeploycoreDeploycoreAppserviceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponse setBody(DeleteLinkedeploycoreDeploycoreAppserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody getBody() {
        return this.body;
    }

}
