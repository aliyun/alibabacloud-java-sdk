// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class AnalyzeAppLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AnalyzeAppLogResponseBody body;

    public static AnalyzeAppLogResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeAppLogResponse self = new AnalyzeAppLogResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeAppLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeAppLogResponse setBody(AnalyzeAppLogResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeAppLogResponseBody getBody() {
        return this.body;
    }

}
