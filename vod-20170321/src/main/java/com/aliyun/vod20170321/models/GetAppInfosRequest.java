// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppInfosRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIds;

    public static GetAppInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppInfosRequest self = new GetAppInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetAppInfosRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

}
