// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetInstanceInstanceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountName")
    public String accountName;

    public static GetInstanceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInstanceRequest self = new GetInstanceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceInstanceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetInstanceInstanceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetInstanceInstanceRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
