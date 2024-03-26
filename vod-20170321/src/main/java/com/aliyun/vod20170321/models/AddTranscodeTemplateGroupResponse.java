// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddTranscodeTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTranscodeTemplateGroupResponseBody body;

    public static AddTranscodeTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTranscodeTemplateGroupResponse self = new AddTranscodeTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddTranscodeTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTranscodeTemplateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTranscodeTemplateGroupResponse setBody(AddTranscodeTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTranscodeTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
