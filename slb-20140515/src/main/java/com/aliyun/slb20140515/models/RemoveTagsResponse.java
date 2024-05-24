// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveTagsResponseBody body;

    public static RemoveTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsResponse self = new RemoveTagsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTagsResponse setBody(RemoveTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTagsResponseBody getBody() {
        return this.body;
    }

}
