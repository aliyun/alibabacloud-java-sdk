// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DelAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppItemId")
    public String appItemId;

    public static DelAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DelAppRequest self = new DelAppRequest();
        return TeaModel.build(map, self);
    }

    public DelAppRequest setAppItemId(String appItemId) {
        this.appItemId = appItemId;
        return this;
    }
    public String getAppItemId() {
        return this.appItemId;
    }

}
