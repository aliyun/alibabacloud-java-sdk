// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLTrainingProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRLTrainingProgressResponseBody body;

    public static GetRLTrainingProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRLTrainingProgressResponse self = new GetRLTrainingProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetRLTrainingProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRLTrainingProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRLTrainingProgressResponse setBody(GetRLTrainingProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRLTrainingProgressResponseBody getBody() {
        return this.body;
    }

}
