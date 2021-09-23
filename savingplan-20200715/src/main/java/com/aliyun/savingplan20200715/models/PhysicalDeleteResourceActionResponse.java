// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class PhysicalDeleteResourceActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PhysicalDeleteResourceActionResponseBody body;

    public static PhysicalDeleteResourceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        PhysicalDeleteResourceActionResponse self = new PhysicalDeleteResourceActionResponse();
        return TeaModel.build(map, self);
    }

    public PhysicalDeleteResourceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhysicalDeleteResourceActionResponse setBody(PhysicalDeleteResourceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public PhysicalDeleteResourceActionResponseBody getBody() {
        return this.body;
    }

}
