// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DisposalTool</p>
     */
    @NameInMap("AuthType")
    public String authType;

    public static GetServiceLinkedRoleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleStatusRequest self = new GetServiceLinkedRoleStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleStatusRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

}
