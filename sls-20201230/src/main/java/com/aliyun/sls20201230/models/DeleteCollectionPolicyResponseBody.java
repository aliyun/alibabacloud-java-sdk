// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteCollectionPolicyResponseBody extends TeaModel {
    @NameInMap("message")
    public String message;

    public static DeleteCollectionPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectionPolicyResponseBody self = new DeleteCollectionPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCollectionPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
