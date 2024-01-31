// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveTagsFromResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveTagsFromResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTagsFromResourceResponse setBody(RemoveTagsFromResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTagsFromResourceResponseBody getBody() {
        return this.body;
    }

}
