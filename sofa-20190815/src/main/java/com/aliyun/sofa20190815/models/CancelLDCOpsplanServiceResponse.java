// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLDCOpsplanServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLDCOpsplanServiceResponseBody body;

    public static CancelLDCOpsplanServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLDCOpsplanServiceResponse self = new CancelLDCOpsplanServiceResponse();
        return TeaModel.build(map, self);
    }

    public CancelLDCOpsplanServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLDCOpsplanServiceResponse setBody(CancelLDCOpsplanServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLDCOpsplanServiceResponseBody getBody() {
        return this.body;
    }

}
