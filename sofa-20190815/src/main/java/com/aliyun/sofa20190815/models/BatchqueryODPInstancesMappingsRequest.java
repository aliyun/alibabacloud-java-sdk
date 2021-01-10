// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPInstancesMappingsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TargetTenant")
    public String targetTenant;

    public static BatchqueryODPInstancesMappingsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPInstancesMappingsRequest self = new BatchqueryODPInstancesMappingsRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPInstancesMappingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchqueryODPInstancesMappingsRequest setTargetTenant(String targetTenant) {
        this.targetTenant = targetTenant;
        return this;
    }
    public String getTargetTenant() {
        return this.targetTenant;
    }

}
