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

}
