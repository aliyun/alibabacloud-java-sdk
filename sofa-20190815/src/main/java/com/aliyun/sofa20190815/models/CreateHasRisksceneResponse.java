// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasRisksceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasRisksceneResponseBody body;

    public static CreateHasRisksceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasRisksceneResponse self = new CreateHasRisksceneResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasRisksceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasRisksceneResponse setBody(CreateHasRisksceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasRisksceneResponseBody getBody() {
        return this.body;
    }

}
