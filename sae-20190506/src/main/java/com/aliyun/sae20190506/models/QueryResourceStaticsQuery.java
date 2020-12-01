// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static QueryResourceStaticsQuery build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceStaticsQuery self = new QueryResourceStaticsQuery();
        return TeaModel.build(map, self);
    }

    public QueryResourceStaticsQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
