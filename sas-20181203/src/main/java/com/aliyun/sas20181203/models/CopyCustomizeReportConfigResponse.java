// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CopyCustomizeReportConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyCustomizeReportConfigResponseBody body;

    public static CopyCustomizeReportConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyCustomizeReportConfigResponse self = new CopyCustomizeReportConfigResponse();
        return TeaModel.build(map, self);
    }

    public CopyCustomizeReportConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyCustomizeReportConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyCustomizeReportConfigResponse setBody(CopyCustomizeReportConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyCustomizeReportConfigResponseBody getBody() {
        return this.body;
    }

}
