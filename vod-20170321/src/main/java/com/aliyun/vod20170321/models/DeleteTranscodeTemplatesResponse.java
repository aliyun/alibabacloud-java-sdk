// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTranscodeTemplatesResponseBody body;

    public static DeleteTranscodeTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscodeTemplatesResponse self = new DeleteTranscodeTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTranscodeTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTranscodeTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTranscodeTemplatesResponse setBody(DeleteTranscodeTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTranscodeTemplatesResponseBody getBody() {
        return this.body;
    }

}
