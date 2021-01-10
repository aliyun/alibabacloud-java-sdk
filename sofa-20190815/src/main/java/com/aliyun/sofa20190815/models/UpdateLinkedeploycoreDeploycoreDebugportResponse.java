// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkedeploycoreDeploycoreDebugportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkedeploycoreDeploycoreDebugportResponseBody body;

    public static UpdateLinkedeploycoreDeploycoreDebugportResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkedeploycoreDeploycoreDebugportResponse self = new UpdateLinkedeploycoreDeploycoreDebugportResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkedeploycoreDeploycoreDebugportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkedeploycoreDeploycoreDebugportResponse setBody(UpdateLinkedeploycoreDeploycoreDebugportResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkedeploycoreDeploycoreDebugportResponseBody getBody() {
        return this.body;
    }

}
