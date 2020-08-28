// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateRoleRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("Description")
    public String description;

    @NameInMap("AssumeRolePolicyDocument")
    public String assumeRolePolicyDocument;

    @NameInMap("MaxSessionDuration")
    public Long maxSessionDuration;

    public static CreateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleRequest self = new CreateRoleRequest();
        return TeaModel.build(map, self);
    }

}
