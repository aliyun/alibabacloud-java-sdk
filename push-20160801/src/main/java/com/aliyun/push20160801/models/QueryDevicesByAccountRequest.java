// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDevicesByAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AppKey")
    public Long appKey;

    public static QueryDevicesByAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesByAccountRequest self = new QueryDevicesByAccountRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicesByAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public QueryDevicesByAccountRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

}
