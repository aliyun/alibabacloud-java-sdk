// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAppInfosRequest extends TeaModel {
    /**
     * <p>The IDs of applications. You can obtain application IDs from the response to the [CreateAppInfo](~~113266~~) or [ListAppInfo](~~114000~~) operation.</p>
     * <br>
     * <p>*   You can specify a maximum of 10 application IDs.</p>
     * <p>*   Separate application IDs with commas (,).</p>
     */
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
