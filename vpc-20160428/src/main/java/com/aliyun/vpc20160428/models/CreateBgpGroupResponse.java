// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBgpGroupResponseBody body;

    public static CreateBgpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpGroupResponse self = new CreateBgpGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateBgpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBgpGroupResponse setBody(CreateBgpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBgpGroupResponseBody getBody() {
        return this.body;
    }

}
