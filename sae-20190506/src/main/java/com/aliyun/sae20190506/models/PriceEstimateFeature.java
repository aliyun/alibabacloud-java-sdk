// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PriceEstimateFeature extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("CpuCore")
    public Float cpuCore;

    @NameInMap("CpuStrategy")
    public String cpuStrategy;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("HighLoadInstanceCount")
    public Long highLoadInstanceCount;

    @NameInMap("HighLoadQps")
    public Float highLoadQps;

    @NameInMap("HighLoadSeconds")
    public Long highLoadSeconds;

    @NameInMap("InstanceQps")
    public Float instanceQps;

    @NameInMap("InternetOutboundGiB")
    public Float internetOutboundGiB;

    @NameInMap("LowLoadInstanceCount")
    public Long lowLoadInstanceCount;

    @NameInMap("LowLoadQps")
    public Float lowLoadQps;

    @NameInMap("LowLoadSeconds")
    public Long lowLoadSeconds;

    @NameInMap("MaxInstanceCount")
    public Long maxInstanceCount;

    @NameInMap("MemoryGiB")
    public Float memoryGiB;

    @NameInMap("MinInstanceCount")
    public Long minInstanceCount;

    @NameInMap("NoneLoadInstanceCount")
    public Long noneLoadInstanceCount;

    @NameInMap("NoneLoadSeconds")
    public Long noneLoadSeconds;

    @NameInMap("RegionId")
    public String regionId;

    public static PriceEstimateFeature build(java.util.Map<String, ?> map) throws Exception {
        PriceEstimateFeature self = new PriceEstimateFeature();
        return TeaModel.build(map, self);
    }

    public PriceEstimateFeature setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public PriceEstimateFeature setCpuCore(Float cpuCore) {
        this.cpuCore = cpuCore;
        return this;
    }
    public Float getCpuCore() {
        return this.cpuCore;
    }

    public PriceEstimateFeature setCpuStrategy(String cpuStrategy) {
        this.cpuStrategy = cpuStrategy;
        return this;
    }
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    public PriceEstimateFeature setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public PriceEstimateFeature setHighLoadInstanceCount(Long highLoadInstanceCount) {
        this.highLoadInstanceCount = highLoadInstanceCount;
        return this;
    }
    public Long getHighLoadInstanceCount() {
        return this.highLoadInstanceCount;
    }

    public PriceEstimateFeature setHighLoadQps(Float highLoadQps) {
        this.highLoadQps = highLoadQps;
        return this;
    }
    public Float getHighLoadQps() {
        return this.highLoadQps;
    }

    public PriceEstimateFeature setHighLoadSeconds(Long highLoadSeconds) {
        this.highLoadSeconds = highLoadSeconds;
        return this;
    }
    public Long getHighLoadSeconds() {
        return this.highLoadSeconds;
    }

    public PriceEstimateFeature setInstanceQps(Float instanceQps) {
        this.instanceQps = instanceQps;
        return this;
    }
    public Float getInstanceQps() {
        return this.instanceQps;
    }

    public PriceEstimateFeature setInternetOutboundGiB(Float internetOutboundGiB) {
        this.internetOutboundGiB = internetOutboundGiB;
        return this;
    }
    public Float getInternetOutboundGiB() {
        return this.internetOutboundGiB;
    }

    public PriceEstimateFeature setLowLoadInstanceCount(Long lowLoadInstanceCount) {
        this.lowLoadInstanceCount = lowLoadInstanceCount;
        return this;
    }
    public Long getLowLoadInstanceCount() {
        return this.lowLoadInstanceCount;
    }

    public PriceEstimateFeature setLowLoadQps(Float lowLoadQps) {
        this.lowLoadQps = lowLoadQps;
        return this;
    }
    public Float getLowLoadQps() {
        return this.lowLoadQps;
    }

    public PriceEstimateFeature setLowLoadSeconds(Long lowLoadSeconds) {
        this.lowLoadSeconds = lowLoadSeconds;
        return this;
    }
    public Long getLowLoadSeconds() {
        return this.lowLoadSeconds;
    }

    public PriceEstimateFeature setMaxInstanceCount(Long maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        return this;
    }
    public Long getMaxInstanceCount() {
        return this.maxInstanceCount;
    }

    public PriceEstimateFeature setMemoryGiB(Float memoryGiB) {
        this.memoryGiB = memoryGiB;
        return this;
    }
    public Float getMemoryGiB() {
        return this.memoryGiB;
    }

    public PriceEstimateFeature setMinInstanceCount(Long minInstanceCount) {
        this.minInstanceCount = minInstanceCount;
        return this;
    }
    public Long getMinInstanceCount() {
        return this.minInstanceCount;
    }

    public PriceEstimateFeature setNoneLoadInstanceCount(Long noneLoadInstanceCount) {
        this.noneLoadInstanceCount = noneLoadInstanceCount;
        return this;
    }
    public Long getNoneLoadInstanceCount() {
        return this.noneLoadInstanceCount;
    }

    public PriceEstimateFeature setNoneLoadSeconds(Long noneLoadSeconds) {
        this.noneLoadSeconds = noneLoadSeconds;
        return this;
    }
    public Long getNoneLoadSeconds() {
        return this.noneLoadSeconds;
    }

    public PriceEstimateFeature setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
