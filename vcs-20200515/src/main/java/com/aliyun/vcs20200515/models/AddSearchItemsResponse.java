// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddSearchItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSearchItemsResponseBody body;

    public static AddSearchItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSearchItemsResponse self = new AddSearchItemsResponse();
        return TeaModel.build(map, self);
    }

    public AddSearchItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSearchItemsResponse setBody(AddSearchItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSearchItemsResponseBody getBody() {
        return this.body;
    }

}
