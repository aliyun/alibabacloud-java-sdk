// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateGWAppAuthApiRequest extends TeaModel {
    @NameInMap("ApiInfoIdListRepeatList")
    public java.util.List<String> apiInfoIdListRepeatList;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("EncryptionStatus")
    public String encryptionStatus;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateGWAppAuthApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGWAppAuthApiRequest self = new UpdateGWAppAuthApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGWAppAuthApiRequest setApiInfoIdListRepeatList(java.util.List<String> apiInfoIdListRepeatList) {
        this.apiInfoIdListRepeatList = apiInfoIdListRepeatList;
        return this;
    }
    public java.util.List<String> getApiInfoIdListRepeatList() {
        return this.apiInfoIdListRepeatList;
    }

    public UpdateGWAppAuthApiRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateGWAppAuthApiRequest setEncryptionStatus(String encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
        return this;
    }
    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    public UpdateGWAppAuthApiRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateGWAppAuthApiRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
