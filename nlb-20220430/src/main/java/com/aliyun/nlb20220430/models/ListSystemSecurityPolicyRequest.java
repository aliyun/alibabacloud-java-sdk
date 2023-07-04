// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSystemSecurityPolicyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListSystemSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemSecurityPolicyRequest self = new ListSystemSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemSecurityPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
