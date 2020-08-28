// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Role")
    @Validation(required = true)
    public CreateRoleResponseRole role;

    public static CreateRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleResponse self = new CreateRoleResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateRoleResponseRole extends TeaModel {
        @NameInMap("RoleId")
        @Validation(required = true)
        public String roleId;

        @NameInMap("RoleName")
        @Validation(required = true)
        public String roleName;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AssumeRolePolicyDocument")
        @Validation(required = true)
        public String assumeRolePolicyDocument;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("MaxSessionDuration")
        @Validation(required = true)
        public Long maxSessionDuration;

        public static CreateRoleResponseRole build(java.util.Map<String, ?> map) throws Exception {
            CreateRoleResponseRole self = new CreateRoleResponseRole();
            return TeaModel.build(map, self);
        }

    }

}
