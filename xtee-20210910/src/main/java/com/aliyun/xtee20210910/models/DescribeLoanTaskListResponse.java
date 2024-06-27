// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeLoanTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoanTaskListResponseBody body;

    public static DescribeLoanTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoanTaskListResponse self = new DescribeLoanTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoanTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoanTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoanTaskListResponse setBody(DescribeLoanTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoanTaskListResponseBody getBody() {
        return this.body;
    }

}
