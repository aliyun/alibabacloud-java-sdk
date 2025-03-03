// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPayerForAccountRequest extends TeaModel {
    /**
     * <p>The ID of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static GetPayerForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPayerForAccountRequest self = new GetPayerForAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetPayerForAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
