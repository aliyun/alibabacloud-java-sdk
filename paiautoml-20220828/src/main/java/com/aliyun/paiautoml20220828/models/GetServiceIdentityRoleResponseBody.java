// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class GetServiceIdentityRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
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

    public GetServiceIdentityRoleResponseBody setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
