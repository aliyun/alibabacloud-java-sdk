// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddGWApiGroupAuthUserRequest extends TeaModel {
    @NameInMap("ApiGroupId")
    public String apiGroupId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("OperatorIdListRepeatList")
    public java.util.List<String> operatorIdListRepeatList;

    public static AddGWApiGroupAuthUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGWApiGroupAuthUserRequest self = new AddGWApiGroupAuthUserRequest();
        return TeaModel.build(map, self);
    }

    public AddGWApiGroupAuthUserRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public AddGWApiGroupAuthUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddGWApiGroupAuthUserRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public AddGWApiGroupAuthUserRequest setOperatorIdListRepeatList(java.util.List<String> operatorIdListRepeatList) {
        this.operatorIdListRepeatList = operatorIdListRepeatList;
        return this;
    }
    public java.util.List<String> getOperatorIdListRepeatList() {
        return this.operatorIdListRepeatList;
    }

}
