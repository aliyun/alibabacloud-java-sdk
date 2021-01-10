// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMqSofamqWarnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMqSofamqWarnResponseBody body;

    public static DisableMqSofamqWarnResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMqSofamqWarnResponse self = new DisableMqSofamqWarnResponse();
        return TeaModel.build(map, self);
    }

    public DisableMqSofamqWarnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMqSofamqWarnResponse setBody(DisableMqSofamqWarnResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMqSofamqWarnResponseBody getBody() {
        return this.body;
    }

}
