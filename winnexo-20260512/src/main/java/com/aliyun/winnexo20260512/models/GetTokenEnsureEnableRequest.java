// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTokenEnsureEnableRequest extends TeaModel {
    /**
     * <p>The ID of the tenant to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The WinNexo user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("wnUserId")
    public String wnUserId;

    public static GetTokenEnsureEnableRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenEnsureEnableRequest self = new GetTokenEnsureEnableRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenEnsureEnableRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetTokenEnsureEnableRequest setWnUserId(String wnUserId) {
        this.wnUserId = wnUserId;
        return this;
    }
    public String getWnUserId() {
        return this.wnUserId;
    }

}
