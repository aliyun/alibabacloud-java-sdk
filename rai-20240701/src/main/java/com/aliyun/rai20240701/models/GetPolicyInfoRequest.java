// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class GetPolicyInfoRequest extends TeaModel {
    /**
     * <p>Detection policy ID</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetPolicyInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyInfoRequest self = new GetPolicyInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPolicyInfoRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public GetPolicyInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
