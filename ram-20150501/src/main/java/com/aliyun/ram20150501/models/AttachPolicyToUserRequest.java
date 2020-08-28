// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AttachPolicyToUserRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("UserName")
    public String userName;

    public static AttachPolicyToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPolicyToUserRequest self = new AttachPolicyToUserRequest();
        return TeaModel.build(map, self);
    }

}
