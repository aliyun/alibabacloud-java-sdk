// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMessageCloudMonitorConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMessageCloudMonitorConfigResponseBody body;

    public static DeleteMessageCloudMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageCloudMonitorConfigResponse self = new DeleteMessageCloudMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMessageCloudMonitorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMessageCloudMonitorConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMessageCloudMonitorConfigResponse setBody(DeleteMessageCloudMonitorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMessageCloudMonitorConfigResponseBody getBody() {
        return this.body;
    }

}
