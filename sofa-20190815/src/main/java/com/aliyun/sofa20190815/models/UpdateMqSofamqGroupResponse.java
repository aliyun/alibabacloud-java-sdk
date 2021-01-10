// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMqSofamqGroupResponseBody body;

    public static UpdateMqSofamqGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqGroupResponse self = new UpdateMqSofamqGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMqSofamqGroupResponse setBody(UpdateMqSofamqGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMqSofamqGroupResponseBody getBody() {
        return this.body;
    }

}
