// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecTSJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecTSJobResponseBody body;

    public static ExecTSJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecTSJobResponse self = new ExecTSJobResponse();
        return TeaModel.build(map, self);
    }

    public ExecTSJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecTSJobResponse setBody(ExecTSJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecTSJobResponseBody getBody() {
        return this.body;
    }

}
