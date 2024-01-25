// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJMeterLogsResponseBody body;

    public static GetJMeterLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterLogsResponse self = new GetJMeterLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetJMeterLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJMeterLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJMeterLogsResponse setBody(GetJMeterLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJMeterLogsResponseBody getBody() {
        return this.body;
    }

}
