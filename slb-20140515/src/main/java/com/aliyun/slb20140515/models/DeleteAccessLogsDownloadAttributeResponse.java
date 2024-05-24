// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteAccessLogsDownloadAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAccessLogsDownloadAttributeResponseBody body;

    public static DeleteAccessLogsDownloadAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessLogsDownloadAttributeResponse self = new DeleteAccessLogsDownloadAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessLogsDownloadAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessLogsDownloadAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessLogsDownloadAttributeResponse setBody(DeleteAccessLogsDownloadAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessLogsDownloadAttributeResponseBody getBody() {
        return this.body;
    }

}
