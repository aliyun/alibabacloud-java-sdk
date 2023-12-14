// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReportBlockVolumesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReportBlockVolumesResponseBody body;

    public static ReportBlockVolumesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReportBlockVolumesResponse self = new ReportBlockVolumesResponse();
        return TeaModel.build(map, self);
    }

    public ReportBlockVolumesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReportBlockVolumesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReportBlockVolumesResponse setBody(ReportBlockVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReportBlockVolumesResponseBody getBody() {
        return this.body;
    }

}
