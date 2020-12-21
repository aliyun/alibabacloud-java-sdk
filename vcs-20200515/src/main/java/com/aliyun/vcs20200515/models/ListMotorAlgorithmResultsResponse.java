// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListMotorAlgorithmResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMotorAlgorithmResultsResponseBody body;

    public static ListMotorAlgorithmResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMotorAlgorithmResultsResponse self = new ListMotorAlgorithmResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListMotorAlgorithmResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMotorAlgorithmResultsResponse setBody(ListMotorAlgorithmResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMotorAlgorithmResultsResponseBody getBody() {
        return this.body;
    }

}
