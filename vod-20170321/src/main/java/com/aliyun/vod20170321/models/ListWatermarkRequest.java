// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListWatermarkRequest extends TeaModel {
    /**
     * <p>The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWatermarkRequest self = new ListWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public ListWatermarkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
