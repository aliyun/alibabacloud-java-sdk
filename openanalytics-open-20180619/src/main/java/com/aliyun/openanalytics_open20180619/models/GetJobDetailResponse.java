// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobDetailResponseBody body;

    public static GetJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobDetailResponse self = new GetJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobDetailResponse setBody(GetJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobDetailResponseBody getBody() {
        return this.body;
    }

}
