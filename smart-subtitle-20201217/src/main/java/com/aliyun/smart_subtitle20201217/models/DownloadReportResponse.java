// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class DownloadReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadReportResponseBody body;

    public static DownloadReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadReportResponse self = new DownloadReportResponse();
        return TeaModel.build(map, self);
    }

    public DownloadReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadReportResponse setBody(DownloadReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadReportResponseBody getBody() {
        return this.body;
    }

}
