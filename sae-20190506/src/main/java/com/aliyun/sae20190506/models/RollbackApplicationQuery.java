// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RollbackApplicationQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    public static RollbackApplicationQuery build(java.util.Map<String, ?> map) throws Exception {
        RollbackApplicationQuery self = new RollbackApplicationQuery();
        return TeaModel.build(map, self);
    }

    public RollbackApplicationQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RollbackApplicationQuery setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public RollbackApplicationQuery setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public RollbackApplicationQuery setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public RollbackApplicationQuery setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

}
