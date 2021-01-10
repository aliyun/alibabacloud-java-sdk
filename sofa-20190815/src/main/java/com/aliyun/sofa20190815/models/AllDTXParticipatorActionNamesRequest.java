// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllDTXParticipatorActionNamesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AllDTXParticipatorActionNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        AllDTXParticipatorActionNamesRequest self = new AllDTXParticipatorActionNamesRequest();
        return TeaModel.build(map, self);
    }

    public AllDTXParticipatorActionNamesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AllDTXParticipatorActionNamesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
