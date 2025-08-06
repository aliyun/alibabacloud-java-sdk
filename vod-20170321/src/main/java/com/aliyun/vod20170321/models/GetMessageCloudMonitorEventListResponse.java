// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMessageCloudMonitorEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageCloudMonitorEventListResponseBody body;

    public static GetMessageCloudMonitorEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageCloudMonitorEventListResponse self = new GetMessageCloudMonitorEventListResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageCloudMonitorEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageCloudMonitorEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageCloudMonitorEventListResponse setBody(GetMessageCloudMonitorEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageCloudMonitorEventListResponseBody getBody() {
        return this.body;
    }

}
