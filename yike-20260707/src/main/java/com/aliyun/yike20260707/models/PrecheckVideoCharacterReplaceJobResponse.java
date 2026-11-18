// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class PrecheckVideoCharacterReplaceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrecheckVideoCharacterReplaceJobResponseBody body;

    public static PrecheckVideoCharacterReplaceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        PrecheckVideoCharacterReplaceJobResponse self = new PrecheckVideoCharacterReplaceJobResponse();
        return TeaModel.build(map, self);
    }

    public PrecheckVideoCharacterReplaceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrecheckVideoCharacterReplaceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrecheckVideoCharacterReplaceJobResponse setBody(PrecheckVideoCharacterReplaceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public PrecheckVideoCharacterReplaceJobResponseBody getBody() {
        return this.body;
    }

}
