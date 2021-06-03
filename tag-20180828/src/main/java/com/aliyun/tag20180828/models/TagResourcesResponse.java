// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class TagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagResourcesResponseBody body;

    public static TagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponse self = new TagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagResourcesResponse setBody(TagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public TagResourcesResponseBody getBody() {
        return this.body;
    }

}
