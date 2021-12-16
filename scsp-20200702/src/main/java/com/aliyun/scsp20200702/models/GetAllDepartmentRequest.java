// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAllDepartmentRequest extends TeaModel {
    // AICCS实例ID，在智能联络中心控制台上可以看到
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAllDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllDepartmentRequest self = new GetAllDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public GetAllDepartmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
