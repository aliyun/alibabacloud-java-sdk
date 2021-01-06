// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    @Validation(required = true)
    public String accountId;

    public static GetAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountRequest self = new GetAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
