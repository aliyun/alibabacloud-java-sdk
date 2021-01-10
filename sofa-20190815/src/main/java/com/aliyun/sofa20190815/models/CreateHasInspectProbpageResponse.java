// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectProbpageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasInspectProbpageResponseBody body;

    public static CreateHasInspectProbpageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectProbpageResponse self = new CreateHasInspectProbpageResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectProbpageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasInspectProbpageResponse setBody(CreateHasInspectProbpageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasInspectProbpageResponseBody getBody() {
        return this.body;
    }

}
