// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDTXAppsRecoverydsnameRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListDTXAppsRecoverydsnameRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDTXAppsRecoverydsnameRequest self = new ListDTXAppsRecoverydsnameRequest();
        return TeaModel.build(map, self);
    }

    public ListDTXAppsRecoverydsnameRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListDTXAppsRecoverydsnameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
