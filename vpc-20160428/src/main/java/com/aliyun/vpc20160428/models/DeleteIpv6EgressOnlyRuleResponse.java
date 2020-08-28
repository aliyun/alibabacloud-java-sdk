// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteIpv6EgressOnlyRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteIpv6EgressOnlyRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpv6EgressOnlyRuleResponse self = new DeleteIpv6EgressOnlyRuleResponse();
        return TeaModel.build(map, self);
    }

}
