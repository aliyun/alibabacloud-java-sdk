// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountTSClientCountRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CountTSClientCountRequest build(java.util.Map<String, ?> map) throws Exception {
        CountTSClientCountRequest self = new CountTSClientCountRequest();
        return TeaModel.build(map, self);
    }

    public CountTSClientCountRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CountTSClientCountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
