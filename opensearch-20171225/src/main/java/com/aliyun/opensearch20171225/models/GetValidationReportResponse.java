// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class GetValidationReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetValidationReportResponseBody body;

    public static GetValidationReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetValidationReportResponse self = new GetValidationReportResponse();
        return TeaModel.build(map, self);
    }

    public GetValidationReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetValidationReportResponse setBody(GetValidationReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetValidationReportResponseBody getBody() {
        return this.body;
    }

}
