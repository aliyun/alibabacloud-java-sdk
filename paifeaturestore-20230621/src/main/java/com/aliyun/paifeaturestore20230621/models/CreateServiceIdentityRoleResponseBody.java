// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateServiceIdentityRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ServiceLinkedRoleAlreadyExistsErrorProblem</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>C03B2680-AC9C-59CD-93C5-8142B92537FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForFeatureStore</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static CreateServiceIdentityRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceIdentityRoleResponseBody self = new CreateServiceIdentityRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceIdentityRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateServiceIdentityRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceIdentityRoleResponseBody setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
