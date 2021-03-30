// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class DeleteRowLevelByTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRowLevelByTagResponseBody body;

    public static DeleteRowLevelByTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowLevelByTagResponse self = new DeleteRowLevelByTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRowLevelByTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRowLevelByTagResponse setBody(DeleteRowLevelByTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRowLevelByTagResponseBody getBody() {
        return this.body;
    }

}
