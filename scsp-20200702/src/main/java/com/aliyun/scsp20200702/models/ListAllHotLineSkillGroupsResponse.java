// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ListAllHotLineSkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllHotLineSkillGroupsResponseBody body;

    public static ListAllHotLineSkillGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllHotLineSkillGroupsResponse self = new ListAllHotLineSkillGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAllHotLineSkillGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllHotLineSkillGroupsResponse setBody(ListAllHotLineSkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllHotLineSkillGroupsResponseBody getBody() {
        return this.body;
    }

}
