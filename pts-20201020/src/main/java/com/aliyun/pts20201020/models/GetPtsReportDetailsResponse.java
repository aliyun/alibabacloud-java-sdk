// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPtsReportDetailsResponseBody body;

    public static GetPtsReportDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPtsReportDetailsResponse self = new GetPtsReportDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetPtsReportDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPtsReportDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPtsReportDetailsResponse setBody(GetPtsReportDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsReportDetailsResponseBody getBody() {
        return this.body;
    }

}
