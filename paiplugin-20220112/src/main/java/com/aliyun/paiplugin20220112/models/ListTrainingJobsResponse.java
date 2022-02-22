// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTrainingJobsResponseBody body;

    public static ListTrainingJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobsResponse self = new ListTrainingJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrainingJobsResponse setBody(ListTrainingJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrainingJobsResponseBody getBody() {
        return this.body;
    }

}
