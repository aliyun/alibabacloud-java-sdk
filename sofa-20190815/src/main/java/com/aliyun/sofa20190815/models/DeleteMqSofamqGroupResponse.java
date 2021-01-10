// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMqSofamqGroupResponseBody body;

    public static DeleteMqSofamqGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqGroupResponse self = new DeleteMqSofamqGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMqSofamqGroupResponse setBody(DeleteMqSofamqGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMqSofamqGroupResponseBody getBody() {
        return this.body;
    }

}
