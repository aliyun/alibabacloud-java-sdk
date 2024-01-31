// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetImageScanNumInPeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageScanNumInPeriodResponseBody body;

    public static GetImageScanNumInPeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageScanNumInPeriodResponse self = new GetImageScanNumInPeriodResponse();
        return TeaModel.build(map, self);
    }

    public GetImageScanNumInPeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageScanNumInPeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageScanNumInPeriodResponse setBody(GetImageScanNumInPeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageScanNumInPeriodResponseBody getBody() {
        return this.body;
    }

}
