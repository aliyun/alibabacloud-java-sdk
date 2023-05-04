// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteAccountShrinkRequest extends TeaModel {
    @NameInMap("AbandonableCheckId")
    public String abandonableCheckIdShrink;

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
