// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMonitorAccountRequest extends TeaModel {
    /**
     * <p>The account IDs of members in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListAccountsInResourceDirectory~~">ListAccountsInResourceDirectory</a> operation to obtain the account IDs. Separate multiple account IDs with commas (,). If you specify a value for this parameter, the existing list of members is replaced by the new list that you specify. Otherwise, the existing list is cleared.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1026780160******,1457515594******</p>
     */
    @NameInMap("AccountIds")
    public String accountIds;

    public static CreateMonitorAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorAccountRequest self = new CreateMonitorAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorAccountRequest setAccountIds(String accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public String getAccountIds() {
        return this.accountIds;
    }

}
