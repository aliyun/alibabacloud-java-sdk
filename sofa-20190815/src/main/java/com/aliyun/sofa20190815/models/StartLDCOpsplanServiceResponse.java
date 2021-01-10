// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLDCOpsplanServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartLDCOpsplanServiceResponseBody body;

    public static StartLDCOpsplanServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLDCOpsplanServiceResponse self = new StartLDCOpsplanServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartLDCOpsplanServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLDCOpsplanServiceResponse setBody(StartLDCOpsplanServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLDCOpsplanServiceResponseBody getBody() {
        return this.body;
    }

}
