// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class BatchGetVideoCharacterReplaceJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetVideoCharacterReplaceJobsResponseBody body;

    public static BatchGetVideoCharacterReplaceJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetVideoCharacterReplaceJobsResponse self = new BatchGetVideoCharacterReplaceJobsResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetVideoCharacterReplaceJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetVideoCharacterReplaceJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetVideoCharacterReplaceJobsResponse setBody(BatchGetVideoCharacterReplaceJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetVideoCharacterReplaceJobsResponseBody getBody() {
        return this.body;
    }

}
