// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListTranscodeTemplateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTranscodeTemplateGroupResponse setBody(ListTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
