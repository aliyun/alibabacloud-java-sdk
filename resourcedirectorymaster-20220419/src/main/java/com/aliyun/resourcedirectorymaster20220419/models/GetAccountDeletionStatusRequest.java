// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetAccountDeletionStatusRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static GetAccountDeletionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountDeletionStatusRequest self = new GetAccountDeletionStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountDeletionStatusRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
