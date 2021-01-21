// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetDeletionProtectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDeletionProtectionResponseBody body;

    public static SetDeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeletionProtectionResponse self = new SetDeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

    public SetDeletionProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeletionProtectionResponse setBody(SetDeletionProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeletionProtectionResponseBody getBody() {
        return this.body;
    }

}
