// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLDCOpsplanServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLDCOpsplanServiceResponseBody body;

    public static RetryLDCOpsplanServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLDCOpsplanServiceResponse self = new RetryLDCOpsplanServiceResponse();
        return TeaModel.build(map, self);
    }

    public RetryLDCOpsplanServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLDCOpsplanServiceResponse setBody(RetryLDCOpsplanServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLDCOpsplanServiceResponseBody getBody() {
        return this.body;
    }

}
