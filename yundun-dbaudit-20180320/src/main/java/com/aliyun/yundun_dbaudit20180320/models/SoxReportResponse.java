// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class SoxReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SoxReportResponseBody body;

    public static SoxReportResponse build(java.util.Map<String, ?> map) throws Exception {
        SoxReportResponse self = new SoxReportResponse();
        return TeaModel.build(map, self);
    }

    public SoxReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SoxReportResponse setBody(SoxReportResponseBody body) {
        this.body = body;
        return this;
    }
    public SoxReportResponseBody getBody() {
        return this.body;
    }

}
