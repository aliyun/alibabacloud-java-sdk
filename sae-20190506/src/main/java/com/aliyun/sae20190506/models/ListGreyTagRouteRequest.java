// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListGreyTagRouteRequest extends TeaModel {
    // 应用ID
    @NameInMap("AppId")
    public String appId;

    public static ListGreyTagRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGreyTagRouteRequest self = new ListGreyTagRouteRequest();
        return TeaModel.build(map, self);
    }

    public ListGreyTagRouteRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
