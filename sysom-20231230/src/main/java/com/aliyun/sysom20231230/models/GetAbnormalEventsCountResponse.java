// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAbnormalEventsCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAbnormalEventsCountResponseBody body;

    public static GetAbnormalEventsCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAbnormalEventsCountResponse self = new GetAbnormalEventsCountResponse();
        return TeaModel.build(map, self);
    }

    public GetAbnormalEventsCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAbnormalEventsCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAbnormalEventsCountResponse setBody(GetAbnormalEventsCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAbnormalEventsCountResponseBody getBody() {
        return this.body;
    }

}
