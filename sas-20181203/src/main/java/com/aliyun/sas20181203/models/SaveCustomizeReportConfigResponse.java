// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveCustomizeReportConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveCustomizeReportConfigResponseBody body;

    public static SaveCustomizeReportConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveCustomizeReportConfigResponse self = new SaveCustomizeReportConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveCustomizeReportConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveCustomizeReportConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveCustomizeReportConfigResponse setBody(SaveCustomizeReportConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveCustomizeReportConfigResponseBody getBody() {
        return this.body;
    }

}
