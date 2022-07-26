// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobElasticSpec extends TeaModel {
    @NameInMap("AIMasterType")
    public String AIMasterType;

    @NameInMap("EnableElasticTraining")
    public Boolean enableElasticTraining;

    @NameInMap("MaxParallelism")
    public Integer maxParallelism;

    @NameInMap("MinParallelism")
    public Integer minParallelism;

    public static JobElasticSpec build(java.util.Map<String, ?> map) throws Exception {
        JobElasticSpec self = new JobElasticSpec();
        return TeaModel.build(map, self);
    }

    public JobElasticSpec setAIMasterType(String AIMasterType) {
        this.AIMasterType = AIMasterType;
        return this;
    }
    public String getAIMasterType() {
        return this.AIMasterType;
    }

    public JobElasticSpec setEnableElasticTraining(Boolean enableElasticTraining) {
        this.enableElasticTraining = enableElasticTraining;
        return this;
    }
    public Boolean getEnableElasticTraining() {
        return this.enableElasticTraining;
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
