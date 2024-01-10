// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateBackupSetDownloadLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBackupSetDownloadLinkResponseBody body;

    public static CreateBackupSetDownloadLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupSetDownloadLinkResponse self = new CreateBackupSetDownloadLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateBackupSetDownloadLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBackupSetDownloadLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBackupSetDownloadLinkResponse setBody(CreateBackupSetDownloadLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBackupSetDownloadLinkResponseBody getBody() {
        return this.body;
    }

}
