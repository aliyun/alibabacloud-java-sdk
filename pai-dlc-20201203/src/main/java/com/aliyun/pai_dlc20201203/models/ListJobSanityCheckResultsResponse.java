// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListJobSanityCheckResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobSanityCheckResultsResponseBody body;

    public static ListJobSanityCheckResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobSanityCheckResultsResponse self = new ListJobSanityCheckResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListJobSanityCheckResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobSanityCheckResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobSanityCheckResultsResponse setBody(ListJobSanityCheckResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobSanityCheckResultsResponseBody getBody() {
        return this.body;
    }

}
