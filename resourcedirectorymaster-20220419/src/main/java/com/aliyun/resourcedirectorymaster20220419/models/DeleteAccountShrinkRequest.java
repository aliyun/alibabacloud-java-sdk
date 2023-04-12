// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteAccountShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the check items that you can choose to ignore for the member deletion.</p>
     * <br>
     * <p>You can obtain the IDs from the response of the [GetAccountDeletionCheckResult](~~GetAccountDeletionCheckResult~~) operation.</p>
     */
    @NameInMap("AbandonableCheckId")
    public String abandonableCheckIdShrink;

    /**
     * <p>The Alibaba Cloud account ID of the member that you want to delete.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static DeleteAccountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountShrinkRequest self = new DeleteAccountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccountShrinkRequest setAbandonableCheckIdShrink(String abandonableCheckIdShrink) {
        this.abandonableCheckIdShrink = abandonableCheckIdShrink;
        return this;
    }
    public String getAbandonableCheckIdShrink() {
        return this.abandonableCheckIdShrink;
    }

    public DeleteAccountShrinkRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
