// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("NewAssumeRolePolicyDocument")
    public String newAssumeRolePolicyDocument;

    @NameInMap("NewMaxSessionDuration")
    public Long newMaxSessionDuration;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

}
