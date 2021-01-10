// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWOperatorRequest extends TeaModel {
    @NameInMap("ParamJsonStr")
    public String paramJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListGWOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGWOperatorRequest self = new ListGWOperatorRequest();
        return TeaModel.build(map, self);
    }

    public ListGWOperatorRequest setParamJsonStr(String paramJsonStr) {
        this.paramJsonStr = paramJsonStr;
        return this;
    }
    public String getParamJsonStr() {
        return this.paramJsonStr;
    }

    public ListGWOperatorRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListGWOperatorRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
