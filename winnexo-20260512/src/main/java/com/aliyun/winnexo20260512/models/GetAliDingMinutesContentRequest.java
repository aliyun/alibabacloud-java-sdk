// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetAliDingMinutesContentRequest extends TeaModel {
    /**
     * <p>The DingTalk minutes ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>76327569643231383535353939365f3436383537393431335f32</p>
     */
    @NameInMap("minutesId")
    public String minutesId;

    /**
     * <p>The ID of the effective tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetAliDingMinutesContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliDingMinutesContentRequest self = new GetAliDingMinutesContentRequest();
        return TeaModel.build(map, self);
    }

    public GetAliDingMinutesContentRequest setMinutesId(String minutesId) {
        this.minutesId = minutesId;
        return this;
    }
    public String getMinutesId() {
        return this.minutesId;
    }

    public GetAliDingMinutesContentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
