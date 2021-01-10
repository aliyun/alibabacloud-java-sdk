// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasDiagnosisPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasDiagnosisPlanResponseBody body;

    public static CreateHasDiagnosisPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasDiagnosisPlanResponse self = new CreateHasDiagnosisPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasDiagnosisPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasDiagnosisPlanResponse setBody(CreateHasDiagnosisPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasDiagnosisPlanResponseBody getBody() {
        return this.body;
    }

}
