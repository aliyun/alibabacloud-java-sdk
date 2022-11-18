// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class SetAdvancedMonitorStateRequest extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagId")
    public String sagId;

    public static SetAdvancedMonitorStateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAdvancedMonitorStateRequest self = new SetAdvancedMonitorStateRequest();
        return TeaModel.build(map, self);
    }

    public SetAdvancedMonitorStateRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SetAdvancedMonitorStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetAdvancedMonitorStateRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

}
