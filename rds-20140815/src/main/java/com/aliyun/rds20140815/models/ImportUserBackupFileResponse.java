// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportUserBackupFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportUserBackupFileResponseBody body;

    public static ImportUserBackupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportUserBackupFileResponse self = new ImportUserBackupFileResponse();
        return TeaModel.build(map, self);
    }

    public ImportUserBackupFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportUserBackupFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportUserBackupFileResponse setBody(ImportUserBackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportUserBackupFileResponseBody getBody() {
        return this.body;
    }

}
