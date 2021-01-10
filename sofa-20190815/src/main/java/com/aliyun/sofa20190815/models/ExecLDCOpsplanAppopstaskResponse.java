// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLDCOpsplanAppopstaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLDCOpsplanAppopstaskResponseBody body;

    public static ExecLDCOpsplanAppopstaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLDCOpsplanAppopstaskResponse self = new ExecLDCOpsplanAppopstaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecLDCOpsplanAppopstaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLDCOpsplanAppopstaskResponse setBody(ExecLDCOpsplanAppopstaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLDCOpsplanAppopstaskResponseBody getBody() {
        return this.body;
    }

}
