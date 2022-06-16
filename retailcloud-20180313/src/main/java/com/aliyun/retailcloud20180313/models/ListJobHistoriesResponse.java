// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListJobHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobHistoriesResponseBody body;

    public static ListJobHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobHistoriesResponse self = new ListJobHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListJobHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobHistoriesResponse setBody(ListJobHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobHistoriesResponseBody getBody() {
        return this.body;
    }

}
