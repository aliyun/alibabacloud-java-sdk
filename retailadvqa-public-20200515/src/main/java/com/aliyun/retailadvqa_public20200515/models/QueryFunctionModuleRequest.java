// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class QueryFunctionModuleRequest extends TeaModel {
    // oem_access_id
    @NameInMap("AccessId")
    public String accessId;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryFunctionModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFunctionModuleRequest self = new QueryFunctionModuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryFunctionModuleRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public QueryFunctionModuleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
