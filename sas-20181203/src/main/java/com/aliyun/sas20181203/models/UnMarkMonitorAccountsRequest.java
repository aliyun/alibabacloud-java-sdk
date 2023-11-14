// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnMarkMonitorAccountsRequest extends TeaModel {
    @NameInMap("AccountIds")
    public String accountIds;

    public static UnMarkMonitorAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        UnMarkMonitorAccountsRequest self = new UnMarkMonitorAccountsRequest();
        return TeaModel.build(map, self);
    }

    public UnMarkMonitorAccountsRequest setAccountIds(String accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public String getAccountIds() {
        return this.accountIds;
    }

}
