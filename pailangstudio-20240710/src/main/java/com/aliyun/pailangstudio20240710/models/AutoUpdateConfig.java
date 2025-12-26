// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class AutoUpdateConfig extends TeaModel {
    /**
     * <p>运行资源配置</p>
     */
    @NameInMap("EcsSpecs")
    public java.util.List<AutoUpdateConfigEcsSpecs> ecsSpecs;

    /**
     * <p>Embedding配置</p>
     */
    @NameInMap("EmbeddingConfig")
    public AutoUpdateConfigEmbeddingConfig embeddingConfig;

    /**
     * <p>任务最大运行时间</p>
     */
    @NameInMap("MaxRunningTimeInSeconds")
    public Integer maxRunningTimeInSeconds;

    /**
     * <p>资源组ID</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>知识库自动更新状态</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>用户VPC配置</p>
     */
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    public static AutoUpdateConfig build(java.util.Map<String, ?> map) throws Exception {
        AutoUpdateConfig self = new AutoUpdateConfig();
        return TeaModel.build(map, self);
    }

    public AutoUpdateConfig setEcsSpecs(java.util.List<AutoUpdateConfigEcsSpecs> ecsSpecs) {
        this.ecsSpecs = ecsSpecs;
        return this;
    }
    public java.util.List<AutoUpdateConfigEcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    public AutoUpdateConfig setEmbeddingConfig(AutoUpdateConfigEmbeddingConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
        return this;
    }
    public AutoUpdateConfigEmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    public AutoUpdateConfig setMaxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
        this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
        return this;
    }
    public Integer getMaxRunningTimeInSeconds() {
        return this.maxRunningTimeInSeconds;
    }

    public AutoUpdateConfig setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AutoUpdateConfig setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AutoUpdateConfig setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static class AutoUpdateConfigEcsSpecs extends TeaModel {
        /**
         * <p>CPU核数</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>驱动版本</p>
         */
        @NameInMap("Driver")
        public String driver;

        /**
         * <p>GPU卡数</p>
         */
        @NameInMap("GPU")
        public Integer GPU;

        /**
         * <p>GPU类型</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <p>机型名称</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>内存大小</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>副本数量</p>
         */
        @NameInMap("PodCount")
        public Integer podCount;

        /**
         * <p>共享内存容量</p>
         */
        @NameInMap("SharedMemory")
        public Integer sharedMemory;

        /**
         * <p>节点类型</p>
         */
        @NameInMap("Type")
        public String type;

        public static AutoUpdateConfigEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            AutoUpdateConfigEcsSpecs self = new AutoUpdateConfigEcsSpecs();
            return TeaModel.build(map, self);
        }

        public AutoUpdateConfigEcsSpecs setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public AutoUpdateConfigEcsSpecs setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public AutoUpdateConfigEcsSpecs setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public AutoUpdateConfigEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public AutoUpdateConfigEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public AutoUpdateConfigEcsSpecs setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public AutoUpdateConfigEcsSpecs setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public AutoUpdateConfigEcsSpecs setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public AutoUpdateConfigEcsSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AutoUpdateConfigEmbeddingConfig extends TeaModel {
        /**
         * <p>Embedding分批大小</p>
         */
        @NameInMap("BatchSize")
        public Integer batchSize;

        /**
         * <p>Embedding并发数</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        public static AutoUpdateConfigEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            AutoUpdateConfigEmbeddingConfig self = new AutoUpdateConfigEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public AutoUpdateConfigEmbeddingConfig setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public AutoUpdateConfigEmbeddingConfig setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

    }

}
