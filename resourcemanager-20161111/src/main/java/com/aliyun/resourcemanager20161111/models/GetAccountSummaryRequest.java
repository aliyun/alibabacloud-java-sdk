// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetAccountSummaryRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    public static GetAccountSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSummaryRequest self = new GetAccountSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountSummaryRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
