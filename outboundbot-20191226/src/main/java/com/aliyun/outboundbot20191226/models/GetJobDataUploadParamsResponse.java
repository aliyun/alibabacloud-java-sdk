// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetJobDataUploadParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobDataUploadParamsResponseBody body;

    public static GetJobDataUploadParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobDataUploadParamsResponse self = new GetJobDataUploadParamsResponse();
        return TeaModel.build(map, self);
    }

    public GetJobDataUploadParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobDataUploadParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobDataUploadParamsResponse setBody(GetJobDataUploadParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobDataUploadParamsResponseBody getBody() {
        return this.body;
    }

}
