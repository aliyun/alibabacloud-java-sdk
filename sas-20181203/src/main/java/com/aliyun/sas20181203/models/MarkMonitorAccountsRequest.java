// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class MarkMonitorAccountsRequest extends TeaModel {
    /**
     * <p>The IDs of the members.</p>
     */
    @NameInMap("AccountIds")
    public String accountIds;

    public static MarkMonitorAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkMonitorAccountsRequest self = new MarkMonitorAccountsRequest();
        return TeaModel.build(map, self);
    }

    public MarkMonitorAccountsRequest setAccountIds(String accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public String getAccountIds() {
        return this.accountIds;
    }

}
