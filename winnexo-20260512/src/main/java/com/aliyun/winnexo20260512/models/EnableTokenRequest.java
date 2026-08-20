// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class EnableTokenRequest extends TeaModel {
    /**
     * <p>The ID of the effective tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the target user (WINNEXO platform user ID). If this parameter is left empty, the operation is performed on the caller. Administrators can specify another user\&quot;s ID to perform the operation on behalf of that user.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("wnUserId")
    public String wnUserId;

    public static EnableTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableTokenRequest self = new EnableTokenRequest();
        return TeaModel.build(map, self);
    }

    public EnableTokenRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public EnableTokenRequest setWnUserId(String wnUserId) {
        this.wnUserId = wnUserId;
        return this;
    }
    public String getWnUserId() {
        return this.wnUserId;
    }

}
