// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMachinesResponseBody body;

    public static ListMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMachinesResponse self = new ListMachinesResponse();
        return TeaModel.build(map, self);
    }

    public ListMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMachinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMachinesResponse setBody(ListMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMachinesResponseBody getBody() {
        return this.body;
    }

}
