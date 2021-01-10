// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmAKSClusterOpsGroupArrangementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmAKSClusterOpsGroupArrangementResponseBody body;

    public static ConfirmAKSClusterOpsGroupArrangementResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAKSClusterOpsGroupArrangementResponse self = new ConfirmAKSClusterOpsGroupArrangementResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAKSClusterOpsGroupArrangementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAKSClusterOpsGroupArrangementResponse setBody(ConfirmAKSClusterOpsGroupArrangementResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAKSClusterOpsGroupArrangementResponseBody getBody() {
        return this.body;
    }

}
