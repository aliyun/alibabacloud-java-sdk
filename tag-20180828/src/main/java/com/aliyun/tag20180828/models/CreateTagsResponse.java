// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CreateTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTagsResponseBody body;

    public static CreateTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagsResponse self = new CreateTagsResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagsResponse setBody(CreateTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagsResponseBody getBody() {
        return this.body;
    }

}
