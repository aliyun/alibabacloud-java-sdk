// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class EditMemberBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EditMemberBasicInfoResponseBody body;

    public static EditMemberBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        EditMemberBasicInfoResponse self = new EditMemberBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public EditMemberBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditMemberBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EditMemberBasicInfoResponse setBody(EditMemberBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public EditMemberBasicInfoResponseBody getBody() {
        return this.body;
    }

}
