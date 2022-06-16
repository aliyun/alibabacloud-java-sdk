// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class OfflineAppEnvironmentRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    // 是否删除PVC，未传递默认不删除
    @NameInMap("DeletePvc")
    public Boolean deletePvc;

    @NameInMap("EnvId")
    public Long envId;

    public static OfflineAppEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineAppEnvironmentRequest self = new OfflineAppEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public OfflineAppEnvironmentRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public OfflineAppEnvironmentRequest setDeletePvc(Boolean deletePvc) {
        this.deletePvc = deletePvc;
        return this;
    }
    public Boolean getDeletePvc() {
        return this.deletePvc;
    }

    public OfflineAppEnvironmentRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

}
