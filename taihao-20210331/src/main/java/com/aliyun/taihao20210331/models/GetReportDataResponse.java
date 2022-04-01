// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetReportDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReportDataResponseBody body;

    public static GetReportDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReportDataResponse self = new GetReportDataResponse();
        return TeaModel.build(map, self);
    }

    public GetReportDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReportDataResponse setBody(GetReportDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReportDataResponseBody getBody() {
        return this.body;
    }

}
