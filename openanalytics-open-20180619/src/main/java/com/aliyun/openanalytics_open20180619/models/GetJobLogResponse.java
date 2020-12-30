// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobLogResponseBody body;

    public static GetJobLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobLogResponse self = new GetJobLogResponse();
        return TeaModel.build(map, self);
    }

    public GetJobLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobLogResponse setBody(GetJobLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobLogResponseBody getBody() {
        return this.body;
    }

}
