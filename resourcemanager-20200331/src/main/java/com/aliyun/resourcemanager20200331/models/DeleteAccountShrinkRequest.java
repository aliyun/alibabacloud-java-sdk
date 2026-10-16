// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteAccountShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the check item that you can choose to abandon and continue with the member deletion.</p>
     * <p>You can obtain this ID from the AbandonableChecks response parameter of <a href="https://help.aliyun.com/document_detail/448775.html">GetAccountDeletionCheckResult</a>.</p>
     */
    @NameInMap("AbandonableCheckId")
    public String abandonableCheckIdShrink;

    /**
     * <p>The ID of the member to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>169946124551****</p>
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
