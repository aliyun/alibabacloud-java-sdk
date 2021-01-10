// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTSlsConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeDSTSlsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTSlsConfigRequest self = new DescribeDSTSlsConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDSTSlsConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
