// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsSgDowngradeGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMsSgDowngradeGroupResponseBody body;

    public static DisableMsSgDowngradeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMsSgDowngradeGroupResponse self = new DisableMsSgDowngradeGroupResponse();
        return TeaModel.build(map, self);
    }

    public DisableMsSgDowngradeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMsSgDowngradeGroupResponse setBody(DisableMsSgDowngradeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMsSgDowngradeGroupResponseBody getBody() {
        return this.body;
    }

}
