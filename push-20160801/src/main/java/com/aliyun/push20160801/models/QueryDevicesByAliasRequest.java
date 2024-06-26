// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryDevicesByAliasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliasName</p>
     */
    @NameInMap("Alias")
    public String alias;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    public static QueryDevicesByAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicesByAliasRequest self = new QueryDevicesByAliasRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicesByAliasRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public QueryDevicesByAliasRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

}
