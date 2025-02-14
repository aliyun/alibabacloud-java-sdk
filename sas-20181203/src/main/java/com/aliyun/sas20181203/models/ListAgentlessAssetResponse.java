// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentlessAssetResponseBody body;

    public static ListAgentlessAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessAssetResponse self = new ListAgentlessAssetResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentlessAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentlessAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentlessAssetResponse setBody(ListAgentlessAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentlessAssetResponseBody getBody() {
        return this.body;
    }

}
