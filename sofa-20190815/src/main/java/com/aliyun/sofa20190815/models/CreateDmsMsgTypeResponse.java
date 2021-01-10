// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDmsMsgTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDmsMsgTypeResponseBody body;

    public static CreateDmsMsgTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDmsMsgTypeResponse self = new CreateDmsMsgTypeResponse();
        return TeaModel.build(map, self);
    }

    public CreateDmsMsgTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDmsMsgTypeResponse setBody(CreateDmsMsgTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDmsMsgTypeResponseBody getBody() {
        return this.body;
    }

}
