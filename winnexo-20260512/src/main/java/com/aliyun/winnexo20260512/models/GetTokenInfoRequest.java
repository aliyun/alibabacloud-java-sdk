// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTokenInfoRequest extends TeaModel {
    /**
     * <p>The ID of the tenant to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the target user (WINNEXO platform user ID). If left empty, the operation is performed on the caller. Administrators can specify another user\&quot;s ID to perform the operation on their behalf.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("wnUserId")
    public String wnUserId;

    public static GetTokenInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenInfoRequest self = new GetTokenInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetTokenInfoRequest setWnUserId(String wnUserId) {
        this.wnUserId = wnUserId;
        return this;
    }
    public String getWnUserId() {
        return this.wnUserId;
    }

}
