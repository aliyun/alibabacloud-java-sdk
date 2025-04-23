// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class CreateServiceIdentityRoleResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>User don\&quot;t have permission to create SLR.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The role details.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForPaiLLMTrace</p>
     */
    @NameInMap("RoleDetails")
    public String roleDetails;

    /**
     * <p>The name of the service-linked role. Default value: AliyunServiceRoleForPaiLLMTrace.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForPaiLLMTrace</p>
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

    public CreateServiceIdentityRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateServiceIdentityRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceIdentityRoleResponseBody setRoleDetails(String roleDetails) {
        this.roleDetails = roleDetails;
        return this;
    }
    public String getRoleDetails() {
        return this.roleDetails;
    }

    public CreateServiceIdentityRoleResponseBody setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
