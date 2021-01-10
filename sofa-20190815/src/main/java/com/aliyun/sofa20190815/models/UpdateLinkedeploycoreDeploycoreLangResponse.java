// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkedeploycoreDeploycoreLangResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkedeploycoreDeploycoreLangResponseBody body;

    public static UpdateLinkedeploycoreDeploycoreLangResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkedeploycoreDeploycoreLangResponse self = new UpdateLinkedeploycoreDeploycoreLangResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkedeploycoreDeploycoreLangResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkedeploycoreDeploycoreLangResponse setBody(UpdateLinkedeploycoreDeploycoreLangResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkedeploycoreDeploycoreLangResponseBody getBody() {
        return this.body;
    }

}
