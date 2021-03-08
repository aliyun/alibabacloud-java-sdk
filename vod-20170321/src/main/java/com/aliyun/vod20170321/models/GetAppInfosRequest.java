// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppInfosRequest extends TeaModel {
    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("AppIds")
    public String appIds;

    public static GetAppInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInfosRequest self = new GetAppInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetAppInfosRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public GetAppInfosRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

}
