// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentlessRegionResponseBody body;

    public static ListAgentlessRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRegionResponse self = new ListAgentlessRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentlessRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentlessRegionResponse setBody(ListAgentlessRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentlessRegionResponseBody getBody() {
        return this.body;
    }

}
