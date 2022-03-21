// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class TagResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagResourceGroupResponseBody body;

    public static TagResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourceGroupResponse self = new TagResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public TagResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagResourceGroupResponse setBody(TagResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public TagResourceGroupResponseBody getBody() {
        return this.body;
    }

}
