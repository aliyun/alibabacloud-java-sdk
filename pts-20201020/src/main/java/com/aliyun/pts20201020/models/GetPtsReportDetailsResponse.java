// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetPtsReportDetailsResponse setBody(GetPtsReportDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPtsReportDetailsResponseBody getBody() {
        return this.body;
    }

}
