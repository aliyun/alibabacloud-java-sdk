// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class PciReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PciReportResponseBody body;

    public static PciReportResponse build(java.util.Map<String, ?> map) throws Exception {
        PciReportResponse self = new PciReportResponse();
        return TeaModel.build(map, self);
    }

    public PciReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PciReportResponse setBody(PciReportResponseBody body) {
        this.body = body;
        return this;
    }
    public PciReportResponseBody getBody() {
        return this.body;
    }

}
