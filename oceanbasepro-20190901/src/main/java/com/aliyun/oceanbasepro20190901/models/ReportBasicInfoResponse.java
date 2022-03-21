// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ReportBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReportBasicInfoResponseBody body;

    public static ReportBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportBasicInfoResponse self = new ReportBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public ReportBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportBasicInfoResponse setBody(ReportBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportBasicInfoResponseBody getBody() {
        return this.body;
    }

}
