// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSamplingLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJMeterSamplingLogsResponseBody body;

    public static GetJMeterSamplingLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSamplingLogsResponse self = new GetJMeterSamplingLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetJMeterSamplingLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJMeterSamplingLogsResponse setBody(GetJMeterSamplingLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJMeterSamplingLogsResponseBody getBody() {
        return this.body;
    }

}
