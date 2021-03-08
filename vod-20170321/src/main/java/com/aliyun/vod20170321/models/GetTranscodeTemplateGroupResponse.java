// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTranscodeTemplateGroupResponseBody body;

    public static GetTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTemplateGroupResponse self = new GetTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranscodeTemplateGroupResponse setBody(GetTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
