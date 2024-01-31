// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventExportInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSuspEventExportInfoResponseBody body;

    public static DescribeSuspEventExportInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventExportInfoResponse self = new DescribeSuspEventExportInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventExportInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventExportInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventExportInfoResponse setBody(DescribeSuspEventExportInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventExportInfoResponseBody getBody() {
        return this.body;
    }

}
