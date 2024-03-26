// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTranscodeTemplateGroupResponseBody body;

    public static DeleteTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTranscodeTemplateGroupResponse self = new DeleteTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTranscodeTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTranscodeTemplateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTranscodeTemplateGroupResponse setBody(DeleteTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
