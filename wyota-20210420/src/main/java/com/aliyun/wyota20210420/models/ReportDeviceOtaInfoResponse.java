// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportDeviceOtaInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReportDeviceOtaInfoResponseBody body;

    public static ReportDeviceOtaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportDeviceOtaInfoResponse self = new ReportDeviceOtaInfoResponse();
        return TeaModel.build(map, self);
    }

    public ReportDeviceOtaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportDeviceOtaInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportDeviceOtaInfoResponse setBody(ReportDeviceOtaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportDeviceOtaInfoResponseBody getBody() {
        return this.body;
    }

}
