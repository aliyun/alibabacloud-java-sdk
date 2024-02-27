// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class BatchAddFeishuUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddFeishuUsersResponseBody body;

    public static BatchAddFeishuUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddFeishuUsersResponse self = new BatchAddFeishuUsersResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddFeishuUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddFeishuUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddFeishuUsersResponse setBody(BatchAddFeishuUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddFeishuUsersResponseBody getBody() {
        return this.body;
    }

}
