// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetInstanceInstanceInstanceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("AccountName")
    public String accountName;

    public static GetInstanceInstanceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInstanceInstanceRequest self = new GetInstanceInstanceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceInstanceInstanceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetInstanceInstanceInstanceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetInstanceInstanceInstanceRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
