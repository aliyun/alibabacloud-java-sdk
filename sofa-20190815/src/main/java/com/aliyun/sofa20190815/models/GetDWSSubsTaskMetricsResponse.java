// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsTaskMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsTaskMetricsResponseBody body;

    public static GetDWSSubsTaskMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsTaskMetricsResponse self = new GetDWSSubsTaskMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsTaskMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsTaskMetricsResponse setBody(GetDWSSubsTaskMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsTaskMetricsResponseBody getBody() {
        return this.body;
    }

}
