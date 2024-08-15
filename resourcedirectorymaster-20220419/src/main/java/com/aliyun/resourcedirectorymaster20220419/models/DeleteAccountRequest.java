// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteAccountRequest extends TeaModel {
    /**
     * <p>The IDs of the check items that you can choose to ignore for the member deletion.</p>
     * <p>You can obtain the IDs from the response of the <a href="~~GetAccountDeletionCheckResult~~">GetAccountDeletionCheckResult</a> operation.</p>
     */
    @NameInMap("AbandonableCheckId")
    public java.util.List<String> abandonableCheckId;

    /**
     * <p>The Alibaba Cloud account ID of the member that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>169946124551****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static DeleteAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountRequest self = new DeleteAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccountRequest setAbandonableCheckId(java.util.List<String> abandonableCheckId) {
        this.abandonableCheckId = abandonableCheckId;
        return this;
    }
    public java.util.List<String> getAbandonableCheckId() {
        return this.abandonableCheckId;
    }

    public DeleteAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
