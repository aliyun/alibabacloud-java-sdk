// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterReportDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJMeterReportDetailsResponseBody body;

    public static GetJMeterReportDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterReportDetailsResponse self = new GetJMeterReportDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetJMeterReportDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJMeterReportDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJMeterReportDetailsResponse setBody(GetJMeterReportDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJMeterReportDetailsResponseBody getBody() {
        return this.body;
    }

}
