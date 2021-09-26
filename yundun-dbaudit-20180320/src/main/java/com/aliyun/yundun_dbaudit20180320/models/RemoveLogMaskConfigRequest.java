// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class RemoveLogMaskConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaskId")
    public Integer maskId;

    public static RemoveLogMaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLogMaskConfigRequest self = new RemoveLogMaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLogMaskConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveLogMaskConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveLogMaskConfigRequest setMaskId(Integer maskId) {
        this.maskId = maskId;
        return this;
    }
    public Integer getMaskId() {
        return this.maskId;
    }

}
