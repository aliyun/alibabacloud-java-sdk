// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UnmountGWApiGroupAuthUserRequest extends TeaModel {
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

    public static UnmountGWApiGroupAuthUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountGWApiGroupAuthUserRequest self = new UnmountGWApiGroupAuthUserRequest();
        return TeaModel.build(map, self);
    }

    public UnmountGWApiGroupAuthUserRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public UnmountGWApiGroupAuthUserRequest setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public UnmountGWApiGroupAuthUserRequest setAuthUserIdListRepeatList(java.util.List<String> authUserIdListRepeatList) {
        this.authUserIdListRepeatList = authUserIdListRepeatList;
        return this;
    }
    public java.util.List<String> getAuthUserIdListRepeatList() {
        return this.authUserIdListRepeatList;
    }

    public UnmountGWApiGroupAuthUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UnmountGWApiGroupAuthUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
