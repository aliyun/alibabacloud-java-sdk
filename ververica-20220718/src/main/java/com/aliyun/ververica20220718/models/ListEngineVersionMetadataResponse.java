// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListEngineVersionMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEngineVersionMetadataResponseBody body;

    public static ListEngineVersionMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEngineVersionMetadataResponse self = new ListEngineVersionMetadataResponse();
        return TeaModel.build(map, self);
    }

    public ListEngineVersionMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEngineVersionMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEngineVersionMetadataResponse setBody(ListEngineVersionMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEngineVersionMetadataResponseBody getBody() {
        return this.body;
    }

}
