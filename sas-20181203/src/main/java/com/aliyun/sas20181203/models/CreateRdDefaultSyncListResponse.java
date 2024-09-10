// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateRdDefaultSyncListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRdDefaultSyncListResponseBody body;

    public static CreateRdDefaultSyncListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRdDefaultSyncListResponse self = new CreateRdDefaultSyncListResponse();
        return TeaModel.build(map, self);
    }

    public CreateRdDefaultSyncListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRdDefaultSyncListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRdDefaultSyncListResponse setBody(CreateRdDefaultSyncListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRdDefaultSyncListResponseBody getBody() {
        return this.body;
    }

}
