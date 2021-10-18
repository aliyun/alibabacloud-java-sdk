// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class GetInstanceRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    public static GetInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceRequest self = new GetInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
