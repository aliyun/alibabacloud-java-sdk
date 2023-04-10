// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceNodeNumRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeNum")
    public String nodeNum;

    public static ModifyInstanceNodeNumRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNodeNumRequest self = new ModifyInstanceNodeNumRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNodeNumRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceNodeNumRequest setNodeNum(String nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public String getNodeNum() {
        return this.nodeNum;
    }

}
