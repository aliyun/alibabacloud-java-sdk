// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetAdvancedMonitorStateRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagId")
    public String sagId;

    public static GetAdvancedMonitorStateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedMonitorStateRequest self = new GetAdvancedMonitorStateRequest();
        return TeaModel.build(map, self);
    }

    public GetAdvancedMonitorStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAdvancedMonitorStateRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

}
