// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6EgressOnlyRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Ipv6EgressOnlyRuleId")
    @Validation(required = true)
    public String ipv6EgressOnlyRuleId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteIpv6EgressOnlyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6EgressOnlyRuleRequest self = new DeleteIpv6EgressOnlyRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpv6EgressOnlyRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteIpv6EgressOnlyRuleRequest setIpv6EgressOnlyRuleId(String ipv6EgressOnlyRuleId) {
        this.ipv6EgressOnlyRuleId = ipv6EgressOnlyRuleId;
        return this;
    }
    public String getIpv6EgressOnlyRuleId() {
        return this.ipv6EgressOnlyRuleId;
    }

    public DeleteIpv6EgressOnlyRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
