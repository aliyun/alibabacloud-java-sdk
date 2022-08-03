// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class PromoteResourceAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Email")
    public String email;

    public static PromoteResourceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        PromoteResourceAccountRequest self = new PromoteResourceAccountRequest();
        return TeaModel.build(map, self);
    }

    public PromoteResourceAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PromoteResourceAccountRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
