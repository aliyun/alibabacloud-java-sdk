// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListEntitiesForPolicyRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PolicyName")
    public String policyName;

    public static ListEntitiesForPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntitiesForPolicyRequest self = new ListEntitiesForPolicyRequest();
        return TeaModel.build(map, self);
    }

}
