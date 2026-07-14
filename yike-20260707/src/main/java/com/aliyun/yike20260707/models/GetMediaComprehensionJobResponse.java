// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetMediaComprehensionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaComprehensionJobResponseBody body;

    public static GetMediaComprehensionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaComprehensionJobResponse self = new GetMediaComprehensionJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaComprehensionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaComprehensionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaComprehensionJobResponse setBody(GetMediaComprehensionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaComprehensionJobResponseBody getBody() {
        return this.body;
    }

}
