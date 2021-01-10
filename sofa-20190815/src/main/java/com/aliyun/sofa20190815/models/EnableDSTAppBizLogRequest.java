// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableDSTAppBizLogRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EnableDSTAppBizLogRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDSTAppBizLogRequest self = new EnableDSTAppBizLogRequest();
        return TeaModel.build(map, self);
    }

    public EnableDSTAppBizLogRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public EnableDSTAppBizLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
