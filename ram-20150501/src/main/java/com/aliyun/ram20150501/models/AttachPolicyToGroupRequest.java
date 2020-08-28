// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToGroupRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("GroupName")
    public String groupName;

    public static AttachPolicyToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToGroupRequest self = new AttachPolicyToGroupRequest();
        return TeaModel.build(map, self);
    }

}
