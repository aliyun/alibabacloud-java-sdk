// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateTrainingJobRequest extends TeaModel {
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
