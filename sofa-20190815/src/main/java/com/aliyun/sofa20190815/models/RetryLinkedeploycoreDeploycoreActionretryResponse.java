// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkedeploycoreDeploycoreActionretryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkedeploycoreDeploycoreActionretryResponseBody body;

    public static RetryLinkedeploycoreDeploycoreActionretryResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkedeploycoreDeploycoreActionretryResponse self = new RetryLinkedeploycoreDeploycoreActionretryResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponse setBody(RetryLinkedeploycoreDeploycoreActionretryResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkedeploycoreDeploycoreActionretryResponseBody getBody() {
        return this.body;
    }

}
