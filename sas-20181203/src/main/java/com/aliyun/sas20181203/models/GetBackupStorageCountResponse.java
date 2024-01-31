// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBackupStorageCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBackupStorageCountResponseBody body;

    public static GetBackupStorageCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBackupStorageCountResponse self = new GetBackupStorageCountResponse();
        return TeaModel.build(map, self);
    }

    public GetBackupStorageCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBackupStorageCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBackupStorageCountResponse setBody(GetBackupStorageCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackupStorageCountResponseBody getBody() {
        return this.body;
    }

}
