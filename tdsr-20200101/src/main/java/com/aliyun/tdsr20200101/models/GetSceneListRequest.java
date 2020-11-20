// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSceneListRequest extends TeaModel {
    @NameInMap("AccountId")
    public String accountId;

    public static GetSceneListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSceneListRequest self = new GetSceneListRequest();
        return TeaModel.build(map, self);
    }

    public GetSceneListRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
