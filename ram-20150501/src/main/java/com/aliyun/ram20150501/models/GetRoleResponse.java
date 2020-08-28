// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Role")
    @Validation(required = true)
    public GetRoleResponseRole role;

    public static GetRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponse self = new GetRoleResponse();
        return TeaModel.build(map, self);
    }

    public static class GetRoleResponseRole extends TeaModel {
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

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("MaxSessionDuration")
        @Validation(required = true)
        public Long maxSessionDuration;

        public static GetRoleResponseRole build(java.util.Map<String, ?> map) throws Exception {
            GetRoleResponseRole self = new GetRoleResponseRole();
            return TeaModel.build(map, self);
        }

    }

}
