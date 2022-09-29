// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateInferenceJobRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("CampaignId")
    public String campaignId;

    @NameInMap("DataPath")
    public String dataPath;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("TargetPath")
    public String targetPath;

    @NameInMap("TrainingJobId")
    public String trainingJobId;

    @NameInMap("UserConfig")
    public String userConfig;

    public static CreateInferenceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInferenceJobRequest self = new CreateInferenceJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateInferenceJobRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateInferenceJobRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public CreateInferenceJobRequest setDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }
    public String getDataPath() {
        return this.dataPath;
    }

    public CreateInferenceJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateInferenceJobRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateInferenceJobRequest setTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }
    public String getTargetPath() {
        return this.targetPath;
    }

    public CreateInferenceJobRequest setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    public CreateInferenceJobRequest setUserConfig(String userConfig) {
        this.userConfig = userConfig;
        return this;
    }
    public String getUserConfig() {
        return this.userConfig;
    }

}
