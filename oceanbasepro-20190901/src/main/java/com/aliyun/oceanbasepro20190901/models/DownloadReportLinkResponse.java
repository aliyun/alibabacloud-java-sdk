// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DownloadReportLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadReportLinkResponseBody body;

    public static DownloadReportLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadReportLinkResponse self = new DownloadReportLinkResponse();
        return TeaModel.build(map, self);
    }

    public DownloadReportLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadReportLinkResponse setBody(DownloadReportLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadReportLinkResponseBody getBody() {
        return this.body;
    }

}
