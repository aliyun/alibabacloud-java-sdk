// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ContinueCreateStackResponseBody body;

    public static ContinueCreateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinueCreateStackResponse self = new ContinueCreateStackResponse();
        return TeaModel.build(map, self);
    }

    public ContinueCreateStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinueCreateStackResponse setBody(ContinueCreateStackResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinueCreateStackResponseBody getBody() {
        return this.body;
    }

}
