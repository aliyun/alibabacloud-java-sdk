// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpsertCollectionPolicyResponseBody extends TeaModel {
    @NameInMap("message")
    public String message;

    public static UpsertCollectionPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpsertCollectionPolicyResponseBody self = new UpsertCollectionPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpsertCollectionPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
