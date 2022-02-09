// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportdetailinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportdetailinfoResponseBody body;

    public static ReportdetailinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportdetailinfoResponse self = new ReportdetailinfoResponse();
        return TeaModel.build(map, self);
    }

    public ReportdetailinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportdetailinfoResponse setBody(ReportdetailinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportdetailinfoResponseBody getBody() {
        return this.body;
    }

}
