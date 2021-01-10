// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelTSTriggerInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelTSTriggerInstanceResponseBody body;

    public static CancelTSTriggerInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelTSTriggerInstanceResponse self = new CancelTSTriggerInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CancelTSTriggerInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelTSTriggerInstanceResponse setBody(CancelTSTriggerInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelTSTriggerInstanceResponseBody getBody() {
        return this.body;
    }

}
