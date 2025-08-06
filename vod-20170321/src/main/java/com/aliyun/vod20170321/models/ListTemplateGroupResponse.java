// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTemplateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTemplateGroupResponseBody body;

    public static ListTemplateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateGroupResponse self = new ListTemplateGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplateGroupResponse setBody(ListTemplateGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateGroupResponseBody getBody() {
        return this.body;
    }

}
