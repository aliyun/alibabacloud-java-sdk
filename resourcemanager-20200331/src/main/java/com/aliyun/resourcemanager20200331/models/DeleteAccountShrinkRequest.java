// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteAccountShrinkRequest extends TeaModel {
    @NameInMap("AbandonableCheckId")
    public String abandonableCheckIdShrink;

    /**
     * <p>The type of the deletion. Valid values:</p>
     * <br>
     * <p>*   0: direct deletion. If the member does not have pay-as-you-go resources that are purchased within the previous 30 days, the system directly deletes the member.</p>
     * <p>*   1: deletion with a silence period. If the member has pay-as-you-go resources that are purchased within the previous 30 days, the member enters a silence period of 45 days. The system starts to delete the member until the silence period ends. For more information about the silence period, see [What is the silence period for member deletion?](~~446079~~)</p>
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
