// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSNodePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAKSNodePackageResponseBody body;

    public static UpdateAKSNodePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSNodePackageResponse self = new UpdateAKSNodePackageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAKSNodePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAKSNodePackageResponse setBody(UpdateAKSNodePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAKSNodePackageResponseBody getBody() {
        return this.body;
    }

}
