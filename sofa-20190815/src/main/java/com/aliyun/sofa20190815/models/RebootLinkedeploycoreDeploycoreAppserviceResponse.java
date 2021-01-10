// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RebootLinkedeploycoreDeploycoreAppserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody body;

    public static RebootLinkedeploycoreDeploycoreAppserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootLinkedeploycoreDeploycoreAppserviceResponse self = new RebootLinkedeploycoreDeploycoreAppserviceResponse();
        return TeaModel.build(map, self);
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponse setBody(RebootLinkedeploycoreDeploycoreAppserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody getBody() {
        return this.body;
    }

}
