// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class UntagResourcesSystemTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UntagResourcesSystemTagsResponseBody body;

    public static UntagResourcesSystemTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesSystemTagsResponse self = new UntagResourcesSystemTagsResponse();
        return TeaModel.build(map, self);
    }

    public UntagResourcesSystemTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagResourcesSystemTagsResponse setBody(UntagResourcesSystemTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagResourcesSystemTagsResponseBody getBody() {
        return this.body;
    }

}
