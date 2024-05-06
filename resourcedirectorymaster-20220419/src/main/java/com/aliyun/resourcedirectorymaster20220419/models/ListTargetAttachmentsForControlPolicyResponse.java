// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListTargetAttachmentsForControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTargetAttachmentsForControlPolicyResponseBody body;

    public static ListTargetAttachmentsForControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTargetAttachmentsForControlPolicyResponse self = new ListTargetAttachmentsForControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ListTargetAttachmentsForControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTargetAttachmentsForControlPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTargetAttachmentsForControlPolicyResponse setBody(ListTargetAttachmentsForControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTargetAttachmentsForControlPolicyResponseBody getBody() {
        return this.body;
    }

}
