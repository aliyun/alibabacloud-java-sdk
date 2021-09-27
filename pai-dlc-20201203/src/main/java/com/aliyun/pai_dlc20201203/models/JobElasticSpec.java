// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobElasticSpec extends TeaModel {
    // 打开弹性训练
    @NameInMap("EnableElasticTraining")
    public Boolean enableElasticTraining;

    // 最小并行度
    @NameInMap("MinParallelism")
    public Integer minParallelism;

    // 最大并行度
    @NameInMap("MaxParallelism")
    public Integer maxParallelism;

    // aimaster角色使用的资源规格
    @NameInMap("AIMasterType")
    public String AIMasterType;

    public static JobElasticSpec build(java.util.Map<String, ?> map) throws Exception {
        JobElasticSpec self = new JobElasticSpec();
        return TeaModel.build(map, self);
    }

    public JobElasticSpec setEnableElasticTraining(Boolean enableElasticTraining) {
        this.enableElasticTraining = enableElasticTraining;
        return this;
    }
    public Boolean getEnableElasticTraining() {
        return this.enableElasticTraining;
    }

    public JobElasticSpec setMinParallelism(Integer minParallelism) {
        this.minParallelism = minParallelism;
        return this;
    }
    public Integer getMinParallelism() {
        return this.minParallelism;
    }

    public JobElasticSpec setMaxParallelism(Integer maxParallelism) {
        this.maxParallelism = maxParallelism;
        return this;
    }
    public Integer getMaxParallelism() {
        return this.maxParallelism;
    }

    public JobElasticSpec setAIMasterType(String AIMasterType) {
        this.AIMasterType = AIMasterType;
        return this;
    }
    public String getAIMasterType() {
        return this.AIMasterType;
    }

}
