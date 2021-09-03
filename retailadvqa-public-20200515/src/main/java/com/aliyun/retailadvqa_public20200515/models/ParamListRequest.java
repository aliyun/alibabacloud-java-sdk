// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ParamListRequest extends TeaModel {
    // 配置类型
    @NameInMap("ParamType")
    public Long paramType;

    // 平台类型
    @NameInMap("PlatformType")
    public Long platformType;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    // 工作空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ParamListRequest build(java.util.Map<String, ?> map) throws Exception {
        ParamListRequest self = new ParamListRequest();
        return TeaModel.build(map, self);
    }

    public ParamListRequest setParamType(Long paramType) {
        this.paramType = paramType;
        return this;
    }
    public Long getParamType() {
        return this.paramType;
    }

    public ParamListRequest setPlatformType(Long platformType) {
        this.platformType = platformType;
        return this;
    }
    public Long getPlatformType() {
        return this.platformType;
    }

    public ParamListRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ParamListRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ParamListRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
