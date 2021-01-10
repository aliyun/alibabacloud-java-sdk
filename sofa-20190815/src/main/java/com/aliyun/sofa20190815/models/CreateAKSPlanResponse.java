// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSPlanResponseBody body;

    public static CreateAKSPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSPlanResponse self = new CreateAKSPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSPlanResponse setBody(CreateAKSPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSPlanResponseBody getBody() {
        return this.body;
    }

}
