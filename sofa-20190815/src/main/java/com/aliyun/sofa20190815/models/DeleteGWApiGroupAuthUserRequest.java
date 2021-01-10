// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteGWApiGroupAuthUserRequest extends TeaModel {
    @NameInMap("ApiGroupId")
    public String apiGroupId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("UserIdListRepeatList")
    public java.util.List<String> userIdListRepeatList;

    public static DeleteGWApiGroupAuthUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWApiGroupAuthUserRequest self = new DeleteGWApiGroupAuthUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGWApiGroupAuthUserRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public DeleteGWApiGroupAuthUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteGWApiGroupAuthUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DeleteGWApiGroupAuthUserRequest setUserIdListRepeatList(java.util.List<String> userIdListRepeatList) {
        this.userIdListRepeatList = userIdListRepeatList;
        return this;
    }
    public java.util.List<String> getUserIdListRepeatList() {
        return this.userIdListRepeatList;
    }

}
