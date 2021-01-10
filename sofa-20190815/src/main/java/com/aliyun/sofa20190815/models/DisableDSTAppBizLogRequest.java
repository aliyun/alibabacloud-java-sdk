// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableDSTAppBizLogRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableDSTAppBizLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDSTAppBizLogRequest self = new DisableDSTAppBizLogRequest();
        return TeaModel.build(map, self);
    }

    public DisableDSTAppBizLogRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DisableDSTAppBizLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
