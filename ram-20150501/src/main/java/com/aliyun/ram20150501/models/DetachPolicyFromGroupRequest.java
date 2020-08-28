// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DetachPolicyFromGroupRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("GroupName")
    public String groupName;

    public static DetachPolicyFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPolicyFromGroupRequest self = new DetachPolicyFromGroupRequest();
        return TeaModel.build(map, self);
    }

}
