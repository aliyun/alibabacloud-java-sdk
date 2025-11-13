// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUniBackupRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUniBackupRecordResponseBody body;

    public static ListUniBackupRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUniBackupRecordResponse self = new ListUniBackupRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListUniBackupRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUniBackupRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUniBackupRecordResponse setBody(ListUniBackupRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUniBackupRecordResponseBody getBody() {
        return this.body;
    }

}
