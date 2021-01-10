// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqGroupRemarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMqSofamqGroupRemarkResponseBody body;

    public static UpdateMqSofamqGroupRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqGroupRemarkResponse self = new UpdateMqSofamqGroupRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqGroupRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMqSofamqGroupRemarkResponse setBody(UpdateMqSofamqGroupRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMqSofamqGroupRemarkResponseBody getBody() {
        return this.body;
    }

}
