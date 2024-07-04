// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobElasticSpec extends TeaModel {
    @NameInMap("AIMasterDockerImage")
    public String AIMasterDockerImage;

    @NameInMap("AIMasterType")
    public String AIMasterType;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("EDPMaxParallelism")
    public Integer EDPMaxParallelism;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("EDPMinParallelism")
    public Integer EDPMinParallelism;

    @NameInMap("ElasticStrategy")
    public String elasticStrategy;

    @NameInMap("EnableAIMaster")
    public Boolean enableAIMaster;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableEDP")
    public Boolean enableEDP;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableElasticTraining")
    public Boolean enableElasticTraining;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnablePsJobElasticPS")
    public Boolean enablePsJobElasticPS;

    @NameInMap("EnablePsJobElasticWorker")
    public Boolean enablePsJobElasticWorker;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnablePsResourceEstimate")
    public Boolean enablePsResourceEstimate;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MaxParallelism")
    public Integer maxParallelism;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinParallelism")
    public Integer minParallelism;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PSMaxParallelism")
    public Integer PSMaxParallelism;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PSMinParallelism")
    public Integer PSMinParallelism;

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

    public JobElasticSpec setEDPMaxParallelism(Integer EDPMaxParallelism) {
        this.EDPMaxParallelism = EDPMaxParallelism;
        return this;
    }
    public Integer getEDPMaxParallelism() {
        return this.EDPMaxParallelism;
    }

    public JobElasticSpec setEDPMinParallelism(Integer EDPMinParallelism) {
        this.EDPMinParallelism = EDPMinParallelism;
        return this;
    }
    public Integer getEDPMinParallelism() {
        return this.EDPMinParallelism;
    }

    public JobElasticSpec setElasticStrategy(String elasticStrategy) {
        this.elasticStrategy = elasticStrategy;
        return this;
    }
    public String getElasticStrategy() {
        return this.elasticStrategy;
    }

    public JobElasticSpec setEnableAIMaster(Boolean enableAIMaster) {
        this.enableAIMaster = enableAIMaster;
        return this;
    }
    public Boolean getEnableAIMaster() {
        return this.enableAIMaster;
    }

    public JobElasticSpec setEnableEDP(Boolean enableEDP) {
        this.enableEDP = enableEDP;
        return this;
    }
    public Boolean getEnableEDP() {
        return this.enableEDP;
    }

    public JobElasticSpec setEnableElasticTraining(Boolean enableElasticTraining) {
        this.enableElasticTraining = enableElasticTraining;
        return this;
    }
    public Boolean getEnableElasticTraining() {
        return this.enableElasticTraining;
    }

    public JobElasticSpec setEnablePsJobElasticPS(Boolean enablePsJobElasticPS) {
        this.enablePsJobElasticPS = enablePsJobElasticPS;
        return this;
    }
    public Boolean getEnablePsJobElasticPS() {
        return this.enablePsJobElasticPS;
    }

    public JobElasticSpec setEnablePsJobElasticWorker(Boolean enablePsJobElasticWorker) {
        this.enablePsJobElasticWorker = enablePsJobElasticWorker;
        return this;
    }
    public Boolean getEnablePsJobElasticWorker() {
        return this.enablePsJobElasticWorker;
    }

    public JobElasticSpec setEnablePsResourceEstimate(Boolean enablePsResourceEstimate) {
        this.enablePsResourceEstimate = enablePsResourceEstimate;
        return this;
    }
    public Boolean getEnablePsResourceEstimate() {
        return this.enablePsResourceEstimate;
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

    public JobElasticSpec setPSMaxParallelism(Integer PSMaxParallelism) {
        this.PSMaxParallelism = PSMaxParallelism;
        return this;
    }
    public Integer getPSMaxParallelism() {
        return this.PSMaxParallelism;
    }

    public JobElasticSpec setPSMinParallelism(Integer PSMinParallelism) {
        this.PSMinParallelism = PSMinParallelism;
        return this;
    }
    public Integer getPSMinParallelism() {
        return this.PSMinParallelism;
    }

}
