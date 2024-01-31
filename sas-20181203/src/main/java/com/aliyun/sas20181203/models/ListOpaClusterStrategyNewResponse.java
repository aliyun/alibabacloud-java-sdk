// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOpaClusterStrategyNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOpaClusterStrategyNewResponseBody body;

    public static ListOpaClusterStrategyNewResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpaClusterStrategyNewResponse self = new ListOpaClusterStrategyNewResponse();
        return TeaModel.build(map, self);
    }

    public ListOpaClusterStrategyNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpaClusterStrategyNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOpaClusterStrategyNewResponse setBody(ListOpaClusterStrategyNewResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpaClusterStrategyNewResponseBody getBody() {
        return this.body;
    }

}
