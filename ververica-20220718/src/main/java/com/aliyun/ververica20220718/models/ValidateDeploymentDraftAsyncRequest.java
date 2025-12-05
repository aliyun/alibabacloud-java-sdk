// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateDeploymentDraftAsyncRequest extends TeaModel {
    @NameInMap("body")
    public DraftValidateParams body;

    public static ValidateDeploymentDraftAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateDeploymentDraftAsyncRequest self = new ValidateDeploymentDraftAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ValidateDeploymentDraftAsyncRequest setBody(DraftValidateParams body) {
        this.body = body;
        return this;
    }
    public DraftValidateParams getBody() {
        return this.body;
    }

}
