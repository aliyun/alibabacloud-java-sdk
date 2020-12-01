// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListConsumedServicesQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static ListConsumedServicesQuery build(java.util.Map<String, ?> map) throws Exception {
        ListConsumedServicesQuery self = new ListConsumedServicesQuery();
        return TeaModel.build(map, self);
    }

    public ListConsumedServicesQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
