// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteInvalidCloudAccountRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInvalidCloudAccountRecordResponseBody body;

    public static DeleteInvalidCloudAccountRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvalidCloudAccountRecordResponse self = new DeleteInvalidCloudAccountRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInvalidCloudAccountRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInvalidCloudAccountRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInvalidCloudAccountRecordResponse setBody(DeleteInvalidCloudAccountRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInvalidCloudAccountRecordResponseBody getBody() {
        return this.body;
    }

}
