// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribePocTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePocTaskListResponseBody body;

    public static DescribePocTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePocTaskListResponse self = new DescribePocTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePocTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePocTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePocTaskListResponse setBody(DescribePocTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePocTaskListResponseBody getBody() {
        return this.body;
    }

}
