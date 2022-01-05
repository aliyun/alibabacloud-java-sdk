// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class AddStreamGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddStreamGroupResponseBody body;

    public static AddStreamGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStreamGroupResponse self = new AddStreamGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddStreamGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddStreamGroupResponse setBody(AddStreamGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddStreamGroupResponseBody getBody() {
        return this.body;
    }

}
