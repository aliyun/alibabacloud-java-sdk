// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetAccountRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("IncludeTags")
    public Boolean includeTags;

    public static GetAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountRequest self = new GetAccountRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetAccountRequest setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

}
