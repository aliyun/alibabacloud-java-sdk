// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListBackupRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBackupRecordResponseBody body;

    public static ListBackupRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBackupRecordResponse self = new ListBackupRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListBackupRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBackupRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBackupRecordResponse setBody(ListBackupRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBackupRecordResponseBody getBody() {
        return this.body;
    }

}
