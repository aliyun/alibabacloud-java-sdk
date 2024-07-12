// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetServiceIdentityRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     * &quot;Version&quot;: &quot;1&quot;,
     * &quot;Statement&quot;:[]
     * }</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>6F629E92-F64D-502D-85AA-A9C54894CA3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForPaiFeatureStore</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    public static GetServiceIdentityRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceIdentityRoleResponseBody self = new GetServiceIdentityRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceIdentityRoleResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
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
