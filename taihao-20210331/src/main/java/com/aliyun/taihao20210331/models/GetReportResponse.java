// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReportResponseBody body;

    public static GetReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReportResponse self = new GetReportResponse();
        return TeaModel.build(map, self);
    }

    public GetReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReportResponse setBody(GetReportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReportResponseBody getBody() {
        return this.body;
    }

}
