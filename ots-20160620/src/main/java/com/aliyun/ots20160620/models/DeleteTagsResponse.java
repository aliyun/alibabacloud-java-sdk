// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class DeleteTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTagsResponseBody body;

    public static DeleteTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagsResponse self = new DeleteTagsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagsResponse setBody(DeleteTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagsResponseBody getBody() {
        return this.body;
    }

}
