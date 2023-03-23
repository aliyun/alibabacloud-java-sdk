// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobElasticSpec extends TeaModel {
    @NameInMap("AIMasterDockerImage")
    public String AIMasterDockerImage;

    @NameInMap("AIMasterType")
    public String AIMasterType;

    @NameInMap("EnableAIMaster")
    public Boolean enableAIMaster;

    @NameInMap("EnableElasticTraining")
    public Boolean enableElasticTraining;

    @NameInMap("EnablePsJobElasticWorker")
    public Boolean enablePsJobElasticWorker;

    @NameInMap("MaxParallelism")
    public Integer maxParallelism;

    @NameInMap("MinParallelism")
    public Integer minParallelism;

    public static JobElasticSpec build(java.util.Map<String, ?> map) throws Exception {
        JobElasticSpec self = new JobElasticSpec();
        return TeaModel.build(map, self);
    }

    public JobElasticSpec setAIMasterDockerImage(String AIMasterDockerImage) {
        this.AIMasterDockerImage = AIMasterDockerImage;
        return this;
    }
    public String getAIMasterDockerImage() {
        return this.AIMasterDockerImage;
    }

    public JobElasticSpec setAIMasterType(String AIMasterType) {
        this.AIMasterType = AIMasterType;
        return this;
    }
    public String getAIMasterType() {
        return this.AIMasterType;
    }

    public JobElasticSpec setEnableAIMaster(Boolean enableAIMaster) {
        this.enableAIMaster = enableAIMaster;
        return this;
    }
    public Boolean getEnableAIMaster() {
        return this.enableAIMaster;
    }

    public JobElasticSpec setEnableElasticTraining(Boolean enableElasticTraining) {
        this.enableElasticTraining = enableElasticTraining;
        return this;
    }
    public Boolean getEnableElasticTraining() {
        return this.enableElasticTraining;
    }

    public JobElasticSpec setEnablePsJobElasticWorker(Boolean enablePsJobElasticWorker) {
        this.enablePsJobElasticWorker = enablePsJobElasticWorker;
        return this;
    }
    public Boolean getEnablePsJobElasticWorker() {
        return this.enablePsJobElasticWorker;
    }

    public JobElasticSpec setMaxParallelism(Integer maxParallelism) {
        this.maxParallelism = maxParallelism;
        return this;
    }
    public Integer getMaxParallelism() {
        return this.maxParallelism;
    }

    public JobElasticSpec setMinParallelism(Integer minParallelism) {
        this.minParallelism = minParallelism;
        return this;
    }
    public Integer getMinParallelism() {
        return this.minParallelism;
    }

}
