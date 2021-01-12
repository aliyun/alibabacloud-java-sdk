// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddTagsToResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddTagsToResourceResponseBody body;

    public static AddTagsToResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToResourceResponse self = new AddTagsToResourceResponse();
        return TeaModel.build(map, self);
    }

    public AddTagsToResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagsToResourceResponse setBody(AddTagsToResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagsToResourceResponseBody getBody() {
        return this.body;
    }

}
