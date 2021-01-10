// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPDbnodesRequest extends TeaModel {
    @NameInMap("DbnodeJsonStr")
    public String dbnodeJsonStr;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateODPDbnodesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateODPDbnodesRequest self = new CreateODPDbnodesRequest();
        return TeaModel.build(map, self);
    }

    public CreateODPDbnodesRequest setDbnodeJsonStr(String dbnodeJsonStr) {
        this.dbnodeJsonStr = dbnodeJsonStr;
        return this;
    }
    public String getDbnodeJsonStr() {
        return this.dbnodeJsonStr;
    }

    public CreateODPDbnodesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
