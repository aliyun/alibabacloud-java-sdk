// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Group body;

    public static GetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResponse self = new GetGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupResponse setBody(Group body) {
        this.body = body;
        return this;
    }
    public Group getBody() {
        return this.body;
    }

}
