// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListPublishedServicesRequest extends TeaModel {
    /**
     * <p>b2a8a925-477a-4ed7-b825-d5e22500\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListPublishedServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedServicesRequest self = new ListPublishedServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedServicesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
