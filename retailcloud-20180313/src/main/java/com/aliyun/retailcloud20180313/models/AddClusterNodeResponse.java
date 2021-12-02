// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class AddClusterNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddClusterNodeResponseBody body;

    public static AddClusterNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClusterNodeResponse self = new AddClusterNodeResponse();
        return TeaModel.build(map, self);
    }

    public AddClusterNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddClusterNodeResponse setBody(AddClusterNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClusterNodeResponseBody getBody() {
        return this.body;
    }

}
