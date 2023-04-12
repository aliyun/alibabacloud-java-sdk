// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetAccessLogsDownloadAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetAccessLogsDownloadAttributeResponseBody body;

    public static SetAccessLogsDownloadAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAccessLogsDownloadAttributeResponse self = new SetAccessLogsDownloadAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetAccessLogsDownloadAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAccessLogsDownloadAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAccessLogsDownloadAttributeResponse setBody(SetAccessLogsDownloadAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAccessLogsDownloadAttributeResponseBody getBody() {
        return this.body;
    }

}
