// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class CreateServiceIdentityRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ExecutionFailure</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Execution failure, please try again.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3F190916-B3E5-5D1E-AD0C-35C0DF105F51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForPaiAutoml</p>
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

    public CreateServiceIdentityRoleResponseBody setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
