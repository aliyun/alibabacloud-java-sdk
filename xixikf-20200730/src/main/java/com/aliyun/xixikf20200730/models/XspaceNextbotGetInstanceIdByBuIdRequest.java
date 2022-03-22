// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotGetInstanceIdByBuIdRequest extends TeaModel {
    @NameInMap("TenantId")
    public Long tenantId;

    public static XspaceNextbotGetInstanceIdByBuIdRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotGetInstanceIdByBuIdRequest self = new XspaceNextbotGetInstanceIdByBuIdRequest();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotGetInstanceIdByBuIdRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
