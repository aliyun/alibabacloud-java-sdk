// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class PromoteResourceAccountRequest extends TeaModel {
    /**
     * <p>The ID of the resource account you want to upgrade.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The email address used to log on to the cloud account after the upgrade.</p>
     */
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
