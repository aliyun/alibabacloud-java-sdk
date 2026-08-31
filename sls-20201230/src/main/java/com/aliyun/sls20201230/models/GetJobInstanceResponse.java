// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetJobInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JobInstance body;

    public static GetJobInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceResponse self = new GetJobInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobInstanceResponse setBody(JobInstance body) {
        this.body = body;
        return this;
    }
    public JobInstance getBody() {
        return this.body;
    }

}
