// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeletePolicyShrinkRequest extends TeaModel {
    /**
     * <p>List of detection policy IDs</p>
     */
    @NameInMap("PolicyIdList")
    public String policyIdListShrink;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeletePolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyShrinkRequest self = new DeletePolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyShrinkRequest setPolicyIdListShrink(String policyIdListShrink) {
        this.policyIdListShrink = policyIdListShrink;
        return this;
    }
    public String getPolicyIdListShrink() {
        return this.policyIdListShrink;
    }

    public DeletePolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
