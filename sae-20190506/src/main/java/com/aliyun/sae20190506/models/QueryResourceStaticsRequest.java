// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsRequest extends TeaModel {
    /**
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69\<em>\</em>\<em>\</em></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static QueryResourceStaticsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceStaticsRequest self = new QueryResourceStaticsRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceStaticsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
