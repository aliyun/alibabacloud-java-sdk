// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetReportFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetReportFileUrlResponseBody body;

    public static GetReportFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReportFileUrlResponse self = new GetReportFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetReportFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReportFileUrlResponse setBody(GetReportFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetReportFileUrlResponseBody getBody() {
        return this.body;
    }

}
