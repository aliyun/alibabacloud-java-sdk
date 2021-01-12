// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveTagsFromResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveTagsFromResourceResponseBody body;

    public static RemoveTagsFromResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsFromResourceResponse self = new RemoveTagsFromResourceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTagsFromResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTagsFromResourceResponse setBody(RemoveTagsFromResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTagsFromResourceResponseBody getBody() {
        return this.body;
    }

}
