// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200805.models;

import com.aliyun.tea.*;

public class AddRowLevelByTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRowLevelByTagResponseBody body;

    public static AddRowLevelByTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRowLevelByTagResponse self = new AddRowLevelByTagResponse();
        return TeaModel.build(map, self);
    }

    public AddRowLevelByTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRowLevelByTagResponse setBody(AddRowLevelByTagResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRowLevelByTagResponseBody getBody() {
        return this.body;
    }

}
