// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteAccountRequest extends TeaModel {
    /**
     * <p>The ID of the check item that you can choose to abandon and continue with the member deletion.</p>
     * <p>You can obtain this ID from the AbandonableChecks response parameter of <a href="https://help.aliyun.com/document_detail/448775.html">GetAccountDeletionCheckResult</a>.</p>
     */
    @NameInMap("AbandonableCheckId")
    public java.util.List<String> abandonableCheckId;

    /**
     * <p>The ID of the member to delete.</p>
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
