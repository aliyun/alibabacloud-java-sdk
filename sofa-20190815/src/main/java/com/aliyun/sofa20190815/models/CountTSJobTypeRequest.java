// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountTSJobTypeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static CountTSJobTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        CountTSJobTypeRequest self = new CountTSJobTypeRequest();
        return TeaModel.build(map, self);
    }

    public CountTSJobTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
