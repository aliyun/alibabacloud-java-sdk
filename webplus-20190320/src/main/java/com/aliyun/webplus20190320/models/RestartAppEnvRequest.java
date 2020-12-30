// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class RestartAppEnvRequest extends TeaModel {
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

    public static RestartAppEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartAppEnvRequest self = new RestartAppEnvRequest();
        return TeaModel.build(map, self);
    }

    public RestartAppEnvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public RestartAppEnvRequest setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public RestartAppEnvRequest setBatchPercent(Integer batchPercent) {
        this.batchPercent = batchPercent;
        return this;
    }
    public Integer getBatchPercent() {
        return this.batchPercent;
    }

    public RestartAppEnvRequest setBatchInterval(Integer batchInterval) {
        this.batchInterval = batchInterval;
        return this;
    }
    public Integer getBatchInterval() {
        return this.batchInterval;
    }

    public RestartAppEnvRequest setPauseBetweenBatches(Boolean pauseBetweenBatches) {
        this.pauseBetweenBatches = pauseBetweenBatches;
        return this;
    }
    public Boolean getPauseBetweenBatches() {
        return this.pauseBetweenBatches;
    }

}
