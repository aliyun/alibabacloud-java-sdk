// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDevicesByAliasRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("Alias")
    public String alias;

    public static QueryDevicesByAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesByAliasRequest self = new QueryDevicesByAliasRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicesByAliasRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryDevicesByAliasRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}
