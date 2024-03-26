// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetDefaultTranscodeTemplateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultTranscodeTemplateGroupResponse setBody(SetDefaultTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
