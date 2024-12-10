// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListQuotaWorkloadsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListQuotaWorkloadsResponseBody body;

    public static ListQuotaWorkloadsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaWorkloadsResponse self = new ListQuotaWorkloadsResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaWorkloadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaWorkloadsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQuotaWorkloadsResponse setBody(ListQuotaWorkloadsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaWorkloadsResponseBody getBody() {
        return this.body;
    }

}
