// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTagsResponseBody body;

    public static AddTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagsResponse self = new AddTagsResponse();
        return TeaModel.build(map, self);
    }

    public AddTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagsResponse setBody(AddTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagsResponseBody getBody() {
        return this.body;
    }

}
