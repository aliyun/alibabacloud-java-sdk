// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListConsumedServicesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListConsumedServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumedServicesRequest self = new ListConsumedServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumedServicesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
