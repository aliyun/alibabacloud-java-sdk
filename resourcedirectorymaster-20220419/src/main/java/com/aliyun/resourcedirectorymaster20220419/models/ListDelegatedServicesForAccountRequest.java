// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListDelegatedServicesForAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    public static ListDelegatedServicesForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDelegatedServicesForAccountRequest self = new ListDelegatedServicesForAccountRequest();
        return TeaModel.build(map, self);
    }

    public ListDelegatedServicesForAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
