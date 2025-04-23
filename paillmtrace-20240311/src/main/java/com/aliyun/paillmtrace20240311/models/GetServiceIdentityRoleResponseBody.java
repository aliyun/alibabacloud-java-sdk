// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class GetServiceIdentityRoleResponseBody extends TeaModel {
    /**
     * <p>The internal error code. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>EntityNotExist</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message. This parameter is returned only when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>Serivce role does not exit.</p>
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
    @NameInMap("RoleDetail")
    public String roleDetail;

    /**
     * <p>The name of the service-linked role. Default value: AliyunServiceRoleForPaiLLMTrace.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForPaiLLMTrace</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static GetServiceIdentityRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceIdentityRoleResponseBody self = new GetServiceIdentityRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceIdentityRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceIdentityRoleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceIdentityRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceIdentityRoleResponseBody setRoleDetail(String roleDetail) {
        this.roleDetail = roleDetail;
        return this;
    }
    public String getRoleDetail() {
        return this.roleDetail;
    }

    public GetServiceIdentityRoleResponseBody setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
