// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CheckAccountDeleteRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    public static CheckAccountDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountDeleteRequest self = new CheckAccountDeleteRequest();
        return TeaModel.build(map, self);
    }

    public CheckAccountDeleteRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
