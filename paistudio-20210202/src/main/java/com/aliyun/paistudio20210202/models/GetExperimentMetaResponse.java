// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetExperimentMetaResponseBody body;

    public static GetExperimentMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentMetaResponse self = new GetExperimentMetaResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentMetaResponse setBody(GetExperimentMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentMetaResponseBody getBody() {
        return this.body;
    }

}
