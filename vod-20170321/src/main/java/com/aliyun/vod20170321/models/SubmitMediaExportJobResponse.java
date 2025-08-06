// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitMediaExportJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitMediaExportJobResponseBody body;

    public static SubmitMediaExportJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaExportJobResponse self = new SubmitMediaExportJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitMediaExportJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitMediaExportJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitMediaExportJobResponse setBody(SubmitMediaExportJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitMediaExportJobResponseBody getBody() {
        return this.body;
    }

}
