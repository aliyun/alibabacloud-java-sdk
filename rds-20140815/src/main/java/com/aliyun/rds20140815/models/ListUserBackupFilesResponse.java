// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListUserBackupFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserBackupFilesResponseBody body;

    public static ListUserBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserBackupFilesResponse self = new ListUserBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserBackupFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserBackupFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserBackupFilesResponse setBody(ListUserBackupFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserBackupFilesResponseBody getBody() {
        return this.body;
    }

}
