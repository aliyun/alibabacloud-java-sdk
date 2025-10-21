// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeletePolicyRequest extends TeaModel {
    /**
     * <p>List of detection policy IDs</p>
     */
    @NameInMap("PolicyIdList")
    public java.util.List<Long> policyIdList;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeletePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyRequest self = new DeletePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyRequest setPolicyIdList(java.util.List<Long> policyIdList) {
        this.policyIdList = policyIdList;
        return this;
    }
    public java.util.List<Long> getPolicyIdList() {
        return this.policyIdList;
    }

    public DeletePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
