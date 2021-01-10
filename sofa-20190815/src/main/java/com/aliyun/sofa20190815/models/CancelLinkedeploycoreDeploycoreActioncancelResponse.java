// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkedeploycoreDeploycoreActioncancelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLinkedeploycoreDeploycoreActioncancelResponseBody body;

    public static CancelLinkedeploycoreDeploycoreActioncancelResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkedeploycoreDeploycoreActioncancelResponse self = new CancelLinkedeploycoreDeploycoreActioncancelResponse();
        return TeaModel.build(map, self);
    }

    public CancelLinkedeploycoreDeploycoreActioncancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLinkedeploycoreDeploycoreActioncancelResponse setBody(CancelLinkedeploycoreDeploycoreActioncancelResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLinkedeploycoreDeploycoreActioncancelResponseBody getBody() {
        return this.body;
    }

}
