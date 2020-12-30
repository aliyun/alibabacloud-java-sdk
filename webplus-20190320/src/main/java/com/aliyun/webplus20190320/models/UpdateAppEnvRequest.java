// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class UpdateAppEnvRequest extends TeaModel {
    @NameInMap("EnvDescription")
    public String envDescription;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("PkgVersionId")
    public String pkgVersionId;

    @NameInMap("OptionSettings")
    public String optionSettings;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ExtraProperties")
    public String extraProperties;

    @NameInMap("BatchSize")
    public String batchSize;

    @NameInMap("BatchPercent")
    public String batchPercent;

    @NameInMap("BatchInterval")
    public String batchInterval;

    @NameInMap("PauseBetweenBatches")
    public Boolean pauseBetweenBatches;

    public static UpdateAppEnvRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppEnvRequest self = new UpdateAppEnvRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppEnvRequest setEnvDescription(String envDescription) {
        this.envDescription = envDescription;
        return this;
    }
    public String getEnvDescription() {
        return this.envDescription;
    }

    public UpdateAppEnvRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public UpdateAppEnvRequest setPkgVersionId(String pkgVersionId) {
        this.pkgVersionId = pkgVersionId;
        return this;
    }
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

    public UpdateAppEnvRequest setOptionSettings(String optionSettings) {
        this.optionSettings = optionSettings;
        return this;
    }
    public String getOptionSettings() {
        return this.optionSettings;
    }

    public UpdateAppEnvRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public UpdateAppEnvRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateAppEnvRequest setExtraProperties(String extraProperties) {
        this.extraProperties = extraProperties;
        return this;
    }
    public String getExtraProperties() {
        return this.extraProperties;
    }

    public UpdateAppEnvRequest setBatchSize(String batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public String getBatchSize() {
        return this.batchSize;
    }

    public UpdateAppEnvRequest setBatchPercent(String batchPercent) {
        this.batchPercent = batchPercent;
        return this;
    }
    public String getBatchPercent() {
        return this.batchPercent;
    }

    public UpdateAppEnvRequest setBatchInterval(String batchInterval) {
        this.batchInterval = batchInterval;
        return this;
    }
    public String getBatchInterval() {
        return this.batchInterval;
    }

    public UpdateAppEnvRequest setPauseBetweenBatches(Boolean pauseBetweenBatches) {
        this.pauseBetweenBatches = pauseBetweenBatches;
        return this;
    }
    public Boolean getPauseBetweenBatches() {
        return this.pauseBetweenBatches;
    }

}
