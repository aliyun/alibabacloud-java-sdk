// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserInfoByAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    public static QueryUserInfoByAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoByAccountRequest self = new QueryUserInfoByAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoByAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
