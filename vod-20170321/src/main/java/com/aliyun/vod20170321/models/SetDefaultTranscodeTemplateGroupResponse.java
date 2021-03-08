// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDefaultTranscodeTemplateGroupResponseBody body;

    public static SetDefaultTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultTranscodeTemplateGroupResponse self = new SetDefaultTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultTranscodeTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultTranscodeTemplateGroupResponse setBody(SetDefaultTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
