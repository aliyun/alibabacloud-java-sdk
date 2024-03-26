// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTranscodeTemplateGroupResponseBody body;

    public static UpdateTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTranscodeTemplateGroupResponse self = new UpdateTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTranscodeTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTranscodeTemplateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTranscodeTemplateGroupResponse setBody(UpdateTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
