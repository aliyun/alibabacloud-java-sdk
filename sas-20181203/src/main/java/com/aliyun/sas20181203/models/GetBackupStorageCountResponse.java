// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBackupStorageCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetBackupStorageCountResponse setBody(GetBackupStorageCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackupStorageCountResponseBody getBody() {
        return this.body;
    }

}
