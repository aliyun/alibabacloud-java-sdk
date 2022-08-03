// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    public static GetResourceDirectoryAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceDirectoryAccountRequest self = new GetResourceDirectoryAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceDirectoryAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
