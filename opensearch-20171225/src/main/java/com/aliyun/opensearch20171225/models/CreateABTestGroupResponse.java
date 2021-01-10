// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateABTestGroupResponseBody body;

    public static CreateABTestGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestGroupResponse self = new CreateABTestGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateABTestGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateABTestGroupResponse setBody(CreateABTestGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateABTestGroupResponseBody getBody() {
        return this.body;
    }

}
