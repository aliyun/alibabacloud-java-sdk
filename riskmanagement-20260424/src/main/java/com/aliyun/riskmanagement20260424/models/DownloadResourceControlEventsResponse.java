// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DownloadResourceControlEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadResourceControlEventsResponseBody body;

    public static DownloadResourceControlEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadResourceControlEventsResponse self = new DownloadResourceControlEventsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadResourceControlEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadResourceControlEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadResourceControlEventsResponse setBody(DownloadResourceControlEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadResourceControlEventsResponseBody getBody() {
        return this.body;
    }

}
