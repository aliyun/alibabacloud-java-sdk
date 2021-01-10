// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktWorkitemreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinktWorkitemreviewResponseBody body;

    public static CreateLinkeLinktWorkitemreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktWorkitemreviewResponse self = new CreateLinkeLinktWorkitemreviewResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktWorkitemreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinktWorkitemreviewResponse setBody(CreateLinkeLinktWorkitemreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinktWorkitemreviewResponseBody getBody() {
        return this.body;
    }

}
