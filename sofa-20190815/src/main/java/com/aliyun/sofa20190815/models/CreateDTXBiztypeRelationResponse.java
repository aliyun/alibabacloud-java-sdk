// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDTXBiztypeRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDTXBiztypeRelationResponseBody body;

    public static CreateDTXBiztypeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDTXBiztypeRelationResponse self = new CreateDTXBiztypeRelationResponse();
        return TeaModel.build(map, self);
    }

    public CreateDTXBiztypeRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDTXBiztypeRelationResponse setBody(CreateDTXBiztypeRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDTXBiztypeRelationResponseBody getBody() {
        return this.body;
    }

}
