// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppInfoRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppInfoRequest self = new DeleteAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
