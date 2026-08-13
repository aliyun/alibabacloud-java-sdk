// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SyncOrgStructureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncOrgStructureResponseBody body;

    public static SyncOrgStructureResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncOrgStructureResponse self = new SyncOrgStructureResponse();
        return TeaModel.build(map, self);
    }

    public SyncOrgStructureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncOrgStructureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncOrgStructureResponse setBody(SyncOrgStructureResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncOrgStructureResponseBody getBody() {
        return this.body;
    }

}
