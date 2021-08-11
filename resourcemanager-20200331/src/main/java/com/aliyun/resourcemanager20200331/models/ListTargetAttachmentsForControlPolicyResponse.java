// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTargetAttachmentsForControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListTargetAttachmentsForControlPolicyResponse setBody(ListTargetAttachmentsForControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTargetAttachmentsForControlPolicyResponseBody getBody() {
        return this.body;
    }

}
