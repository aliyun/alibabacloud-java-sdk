// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsRequest extends TeaModel {
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
