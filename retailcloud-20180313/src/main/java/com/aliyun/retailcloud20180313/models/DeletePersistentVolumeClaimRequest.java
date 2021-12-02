// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeletePersistentVolumeClaimRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("PersistentVolumeClaimName")
    public String persistentVolumeClaimName;

    public static DeletePersistentVolumeClaimRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePersistentVolumeClaimRequest self = new DeletePersistentVolumeClaimRequest();
        return TeaModel.build(map, self);
    }

    public DeletePersistentVolumeClaimRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeletePersistentVolumeClaimRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public DeletePersistentVolumeClaimRequest setPersistentVolumeClaimName(String persistentVolumeClaimName) {
        this.persistentVolumeClaimName = persistentVolumeClaimName;
        return this;
    }
    public String getPersistentVolumeClaimName() {
        return this.persistentVolumeClaimName;
    }

}
