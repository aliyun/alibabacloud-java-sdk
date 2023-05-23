// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateInferenceJobRequest extends TeaModel {
    /**
     * <p>关联算法。</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>关联运营活动Id。</p>
     */
    @NameInMap("CampaignId")
    public String campaignId;

    /**
     * <p>预测数据路径。</p>
     */
    @NameInMap("DataPath")
    public String dataPath;

    /**
     * <p>预测任务名称。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>备注。</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>输出数据路径，需要为空目录。</p>
     */
    @NameInMap("TargetPath")
    public String targetPath;

    /**
     * <p>关联训练任务。</p>
     */
    @NameInMap("TrainingJobId")
    public String trainingJobId;

    /**
     * <p>用户配置。</p>
     */
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
