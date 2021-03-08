// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteTranscodeTemplateGroupResponse setBody(DeleteTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
