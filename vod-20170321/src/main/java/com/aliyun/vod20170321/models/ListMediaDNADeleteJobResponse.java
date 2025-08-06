// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaDNADeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaDNADeleteJobResponseBody body;

    public static ListMediaDNADeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaDNADeleteJobResponse self = new ListMediaDNADeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaDNADeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaDNADeleteJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaDNADeleteJobResponse setBody(ListMediaDNADeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaDNADeleteJobResponseBody getBody() {
        return this.body;
    }

}
