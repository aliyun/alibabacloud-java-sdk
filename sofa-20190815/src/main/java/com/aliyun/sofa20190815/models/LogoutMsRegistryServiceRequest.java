// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class LogoutMsRegistryServiceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServerIpsRepeatList")
    public java.util.List<String> serverIpsRepeatList;

    public static LogoutMsRegistryServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        LogoutMsRegistryServiceRequest self = new LogoutMsRegistryServiceRequest();
        return TeaModel.build(map, self);
    }

    public LogoutMsRegistryServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public LogoutMsRegistryServiceRequest setServerIpsRepeatList(java.util.List<String> serverIpsRepeatList) {
        this.serverIpsRepeatList = serverIpsRepeatList;
        return this;
    }
    public java.util.List<String> getServerIpsRepeatList() {
        return this.serverIpsRepeatList;
    }

}
