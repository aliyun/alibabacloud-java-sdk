// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateVServerGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVServerGroupResponseBody body;

    public static CreateVServerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVServerGroupResponse self = new CreateVServerGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateVServerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVServerGroupResponse setBody(CreateVServerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVServerGroupResponseBody getBody() {
        return this.body;
    }

}
