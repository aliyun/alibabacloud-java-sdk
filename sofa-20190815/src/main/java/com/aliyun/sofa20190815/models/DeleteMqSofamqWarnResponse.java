// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqWarnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMqSofamqWarnResponseBody body;

    public static DeleteMqSofamqWarnResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqWarnResponse self = new DeleteMqSofamqWarnResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqWarnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMqSofamqWarnResponse setBody(DeleteMqSofamqWarnResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMqSofamqWarnResponseBody getBody() {
        return this.body;
    }

}
