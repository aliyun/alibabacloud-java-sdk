// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateTrainingJobRequest extends TeaModel {
    // 关联算法Id。
    @NameInMap("Algorithm")
    public String algorithm;

    // 关联运营活动Id。
    @NameInMap("CampaignId")
    public String campaignId;

    // 训练数据路径。
    @NameInMap("DataPath")
    public String dataPath;

    // 训练任务名称。
    @NameInMap("Name")
    public String name;

    // 备注。
    @NameInMap("Remark")
    public String remark;

    // 用户配置。
    @NameInMap("UserConfig")
    public String userConfig;

    public static CreateTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainingJobRequest self = new CreateTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrainingJobRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public CreateTrainingJobRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public CreateTrainingJobRequest setDataPath(String dataPath) {
        this.dataPath = dataPath;
        return this;
    }
    public String getDataPath() {
        return this.dataPath;
    }

    public CreateTrainingJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTrainingJobRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateTrainingJobRequest setUserConfig(String userConfig) {
        this.userConfig = userConfig;
        return this;
    }
    public String getUserConfig() {
        return this.userConfig;
    }

}
