// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListInferenceJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInferenceJobsResponseBody body;

    public static ListInferenceJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInferenceJobsResponse self = new ListInferenceJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListInferenceJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInferenceJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInferenceJobsResponse setBody(ListInferenceJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInferenceJobsResponseBody getBody() {
        return this.body;
    }

}
