// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSServiceClientRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("ServerIps")
    public String serverIps;

    public static AddMSServiceClientRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMSServiceClientRequest self = new AddMSServiceClientRequest();
        return TeaModel.build(map, self);
    }

    public AddMSServiceClientRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMSServiceClientRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public AddMSServiceClientRequest setServerIps(String serverIps) {
        this.serverIps = serverIps;
        return this;
    }
    public String getServerIps() {
        return this.serverIps;
    }

}
