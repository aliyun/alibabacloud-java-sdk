// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestoreApplicationByBackupSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreApplicationByBackupSetResponseBody body;

    public static RestoreApplicationByBackupSetResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreApplicationByBackupSetResponse self = new RestoreApplicationByBackupSetResponse();
        return TeaModel.build(map, self);
    }

    public RestoreApplicationByBackupSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreApplicationByBackupSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreApplicationByBackupSetResponse setBody(RestoreApplicationByBackupSetResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreApplicationByBackupSetResponseBody getBody() {
        return this.body;
    }

}
