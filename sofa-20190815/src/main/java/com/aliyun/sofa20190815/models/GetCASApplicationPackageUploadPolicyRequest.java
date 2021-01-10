// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASApplicationPackageUploadPolicyRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetCASApplicationPackageUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCASApplicationPackageUploadPolicyRequest self = new GetCASApplicationPackageUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetCASApplicationPackageUploadPolicyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetCASApplicationPackageUploadPolicyRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetCASApplicationPackageUploadPolicyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
