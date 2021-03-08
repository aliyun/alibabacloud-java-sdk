// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTranscodeTemplateGroupResponseBody body;

    public static ListTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTemplateGroupResponse self = new ListTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListTranscodeTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTranscodeTemplateGroupResponse setBody(ListTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
