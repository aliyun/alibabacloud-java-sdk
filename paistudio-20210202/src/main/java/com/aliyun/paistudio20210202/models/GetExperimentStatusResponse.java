// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetExperimentStatusResponseBody body;

    public static GetExperimentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentStatusResponse self = new GetExperimentStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentStatusResponse setBody(GetExperimentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentStatusResponseBody getBody() {
        return this.body;
    }

}
