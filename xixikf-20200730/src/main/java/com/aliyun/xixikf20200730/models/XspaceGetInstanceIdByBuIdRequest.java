// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceGetInstanceIdByBuIdRequest extends TeaModel {
    @NameInMap("TenantId")
    public Long tenantId;

    public static XspaceGetInstanceIdByBuIdRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceGetInstanceIdByBuIdRequest self = new XspaceGetInstanceIdByBuIdRequest();
        return TeaModel.build(map, self);
    }

    public XspaceGetInstanceIdByBuIdRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
