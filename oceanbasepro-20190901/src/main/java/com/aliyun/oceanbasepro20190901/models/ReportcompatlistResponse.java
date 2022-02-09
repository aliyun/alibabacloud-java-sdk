// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportcompatlistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportcompatlistResponseBody body;

    public static ReportcompatlistResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportcompatlistResponse self = new ReportcompatlistResponse();
        return TeaModel.build(map, self);
    }

    public ReportcompatlistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportcompatlistResponse setBody(ReportcompatlistResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportcompatlistResponseBody getBody() {
        return this.body;
    }

}
