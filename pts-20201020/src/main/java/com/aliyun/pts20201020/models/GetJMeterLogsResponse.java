// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetJMeterLogsResponse setBody(GetJMeterLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJMeterLogsResponseBody getBody() {
        return this.body;
    }

}
