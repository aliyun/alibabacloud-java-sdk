// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateInferenceJobRequest extends TeaModel {
    // 关联算法
    @NameInMap("Algorithm")
    public String algorithm;

    // 训练任务名称
    @NameInMap("Name")
    public String name;

    // 备注
    @NameInMap("Remark")
    public String remark;

    // 关联训练任务
    @NameInMap("TrainingJobId")
    public String trainingJobId;

    // 用户配置
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
