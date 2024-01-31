// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddTagsToResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddTagsToResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagsToResourceResponse setBody(AddTagsToResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagsToResourceResponseBody getBody() {
        return this.body;
    }

}
