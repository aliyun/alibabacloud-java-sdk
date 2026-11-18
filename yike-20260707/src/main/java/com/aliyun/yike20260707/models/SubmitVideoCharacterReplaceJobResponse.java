// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoCharacterReplaceJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoCharacterReplaceJobResponseBody body;

    public static SubmitVideoCharacterReplaceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoCharacterReplaceJobResponse self = new SubmitVideoCharacterReplaceJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoCharacterReplaceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoCharacterReplaceJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoCharacterReplaceJobResponse setBody(SubmitVideoCharacterReplaceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoCharacterReplaceJobResponseBody getBody() {
        return this.body;
    }

}
