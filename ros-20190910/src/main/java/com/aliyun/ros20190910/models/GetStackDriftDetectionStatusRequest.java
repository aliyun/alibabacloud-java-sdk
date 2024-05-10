// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusRequest extends TeaModel {
    /**
     * <p>The ID of the drift detection operation.</p>
     * <br>
     * <p>You can call the [ListStackResourceDrifts](https://help.aliyun.com/document_detail/155098.html) operation to obtain the ID of the drift detection operation.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DriftDetectionId")
    public String driftDetectionId;

    /**
     * <p>The region ID of the stack to be detected for drift.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
