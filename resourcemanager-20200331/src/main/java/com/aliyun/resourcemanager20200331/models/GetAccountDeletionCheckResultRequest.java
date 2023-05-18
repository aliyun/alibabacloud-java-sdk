// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetAccountDeletionCheckResultRequest extends TeaModel {
    /**
     * <p>The ID of the member that you want to delete.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static GetAccountDeletionCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountDeletionCheckResultRequest self = new GetAccountDeletionCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountDeletionCheckResultRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
