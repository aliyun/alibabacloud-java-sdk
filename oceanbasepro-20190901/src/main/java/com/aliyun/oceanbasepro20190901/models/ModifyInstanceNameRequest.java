// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceNameRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // Oceanbase集群名称。 长度为1~20个英文或中文字符。如果没有指定该参数，默认值为集群的InstanceId。
    @NameInMap("InstanceName")
    public String instanceName;

    public static ModifyInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNameRequest self = new ModifyInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
