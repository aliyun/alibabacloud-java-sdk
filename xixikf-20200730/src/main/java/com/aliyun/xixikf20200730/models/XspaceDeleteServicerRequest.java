// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceDeleteServicerRequest extends TeaModel {
    @NameInMap("ServicerId")
    public Long servicerId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static XspaceDeleteServicerRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceDeleteServicerRequest self = new XspaceDeleteServicerRequest();
        return TeaModel.build(map, self);
    }

    public XspaceDeleteServicerRequest setServicerId(Long servicerId) {
        this.servicerId = servicerId;
        return this;
    }
    public Long getServicerId() {
        return this.servicerId;
    }

    public XspaceDeleteServicerRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
