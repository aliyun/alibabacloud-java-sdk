// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToRoleRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("RoleName")
    public String roleName;

    public static AttachPolicyToRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToRoleRequest self = new AttachPolicyToRoleRequest();
        return TeaModel.build(map, self);
    }

}
