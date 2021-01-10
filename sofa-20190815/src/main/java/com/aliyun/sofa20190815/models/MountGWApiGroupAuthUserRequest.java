// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountGWApiGroupAuthUserRequest extends TeaModel {
    @NameInMap("ApiGroupId")
    public String apiGroupId;

    @NameInMap("AuthStatus")
    public String authStatus;

    @NameInMap("AuthUserIdListRepeatList")
    public java.util.List<String> authUserIdListRepeatList;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MountGWApiGroupAuthUserRequest build(java.util.Map<String, ?> map) throws Exception {
        MountGWApiGroupAuthUserRequest self = new MountGWApiGroupAuthUserRequest();
        return TeaModel.build(map, self);
    }

    public MountGWApiGroupAuthUserRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public MountGWApiGroupAuthUserRequest setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public MountGWApiGroupAuthUserRequest setAuthUserIdListRepeatList(java.util.List<String> authUserIdListRepeatList) {
        this.authUserIdListRepeatList = authUserIdListRepeatList;
        return this;
    }
    public java.util.List<String> getAuthUserIdListRepeatList() {
        return this.authUserIdListRepeatList;
    }

    public MountGWApiGroupAuthUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MountGWApiGroupAuthUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
