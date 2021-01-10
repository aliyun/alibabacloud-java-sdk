// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMqSofamqWarnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMqSofamqWarnResponseBody body;

    public static EnableMqSofamqWarnResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMqSofamqWarnResponse self = new EnableMqSofamqWarnResponse();
        return TeaModel.build(map, self);
    }

    public EnableMqSofamqWarnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMqSofamqWarnResponse setBody(EnableMqSofamqWarnResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMqSofamqWarnResponseBody getBody() {
        return this.body;
    }

}
