// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOUsageDetailExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMOUsageDetailExportResponseBody body;

    public static DescribeMOUsageDetailExportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOUsageDetailExportResponse self = new DescribeMOUsageDetailExportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMOUsageDetailExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMOUsageDetailExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMOUsageDetailExportResponse setBody(DescribeMOUsageDetailExportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMOUsageDetailExportResponseBody getBody() {
        return this.body;
    }

}
