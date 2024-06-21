// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusRequest extends TeaModel {
    /**
     * <p>The ID of the drift detection operation.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/155098.html">ListStackResourceDrifts</a> operation to obtain the ID of the drift detection operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a7044f0d-6f2e-4128-a307-4524ef88****</p>
     */
    @NameInMap("DriftDetectionId")
    public String driftDetectionId;

    /**
     * <p>The region ID of the stack to be detected for drift.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
