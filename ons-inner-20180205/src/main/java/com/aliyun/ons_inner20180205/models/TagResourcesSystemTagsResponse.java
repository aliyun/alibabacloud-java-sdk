// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class TagResourcesSystemTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagResourcesSystemTagsResponseBody body;

    public static TagResourcesSystemTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesSystemTagsResponse self = new TagResourcesSystemTagsResponse();
        return TeaModel.build(map, self);
    }

    public TagResourcesSystemTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagResourcesSystemTagsResponse setBody(TagResourcesSystemTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public TagResourcesSystemTagsResponseBody getBody() {
        return this.body;
    }

}
