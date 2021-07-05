// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ImportUserBackupFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ImportUserBackupFileResponse setBody(ImportUserBackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportUserBackupFileResponseBody getBody() {
        return this.body;
    }

}
