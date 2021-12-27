// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class AnalyzeProductLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AnalyzeProductLogResponseBody body;

    public static AnalyzeProductLogResponse build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeProductLogResponse self = new AnalyzeProductLogResponse();
        return TeaModel.build(map, self);
    }

    public AnalyzeProductLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnalyzeProductLogResponse setBody(AnalyzeProductLogResponseBody body) {
        this.body = body;
        return this;
    }
    public AnalyzeProductLogResponseBody getBody() {
        return this.body;
    }

}
