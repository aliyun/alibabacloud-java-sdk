// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class UntagResourceAllTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UntagResourceAllTagsResponseBody body;

    public static UntagResourceAllTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceAllTagsResponse self = new UntagResourceAllTagsResponse();
        return TeaModel.build(map, self);
    }

    public UntagResourceAllTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagResourceAllTagsResponse setBody(UntagResourceAllTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagResourceAllTagsResponseBody getBody() {
        return this.body;
    }

}
