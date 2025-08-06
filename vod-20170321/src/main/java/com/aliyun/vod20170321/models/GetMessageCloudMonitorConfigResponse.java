// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCloudMonitorConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageCloudMonitorConfigResponseBody body;

    public static GetMessageCloudMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCloudMonitorConfigResponse self = new GetMessageCloudMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageCloudMonitorConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageCloudMonitorConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageCloudMonitorConfigResponse setBody(GetMessageCloudMonitorConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageCloudMonitorConfigResponseBody getBody() {
        return this.body;
    }

}
