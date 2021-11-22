// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusRequest extends TeaModel {
    @NameInMap("DriftDetectionId")
    public String driftDetectionId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetStackDriftDetectionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackDriftDetectionStatusRequest self = new GetStackDriftDetectionStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetStackDriftDetectionStatusRequest setDriftDetectionId(String driftDetectionId) {
        this.driftDetectionId = driftDetectionId;
        return this;
    }
    public String getDriftDetectionId() {
        return this.driftDetectionId;
    }

    public GetStackDriftDetectionStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
