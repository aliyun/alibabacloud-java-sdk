// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMonitorAccountRequest extends TeaModel {
    /**
     * <p>The ID of the member that you want to delete.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the IDs of the members in the Security Center console.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1840517068******</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static DeleteMonitorAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorAccountRequest self = new DeleteMonitorAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
