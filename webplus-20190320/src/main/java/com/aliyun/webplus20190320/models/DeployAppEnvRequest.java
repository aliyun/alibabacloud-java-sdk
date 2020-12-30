// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DeployAppEnvRequest extends TeaModel {
    @NameInMap("EnvId")
    public String envId;

    @NameInMap("BatchSize")
    public Integer batchSize;

    @NameInMap("BatchPercent")
    public Integer batchPercent;

    @NameInMap("BatchInterval")
    public Integer batchInterval;

    @NameInMap("PauseBetweenBatches")
    public Boolean pauseBetweenBatches;

    @NameInMap("PkgVersionId")
    public String pkgVersionId;

    public static DeployAppEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployAppEnvRequest self = new DeployAppEnvRequest();
        return TeaModel.build(map, self);
    }

    public DeployAppEnvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public DeployAppEnvRequest setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public DeployAppEnvRequest setBatchPercent(Integer batchPercent) {
        this.batchPercent = batchPercent;
        return this;
    }
    public Integer getBatchPercent() {
        return this.batchPercent;
    }

    public DeployAppEnvRequest setBatchInterval(Integer batchInterval) {
        this.batchInterval = batchInterval;
        return this;
    }
    public Integer getBatchInterval() {
        return this.batchInterval;
    }

    public DeployAppEnvRequest setPauseBetweenBatches(Boolean pauseBetweenBatches) {
        this.pauseBetweenBatches = pauseBetweenBatches;
        return this;
    }
    public Boolean getPauseBetweenBatches() {
        return this.pauseBetweenBatches;
    }

    public DeployAppEnvRequest setPkgVersionId(String pkgVersionId) {
        this.pkgVersionId = pkgVersionId;
        return this;
    }
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

}
