// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>This is a description of the knowledge base job.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EcsSpecs")
    public java.util.List<CreateKnowledgeBaseJobRequestEcsSpecs> ecsSpecs;

    @NameInMap("EmbeddingConfig")
    public CreateKnowledgeBaseJobRequestEmbeddingConfig embeddingConfig;

    @NameInMap("JobAction")
    public String jobAction;

    /**
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("MaxRunningTimeInSeconds")
    public Integer maxRunningTimeInSeconds;

    /**
     * <strong>example:</strong>
     * <p>public-cluster</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("UserVpc")
    public CreateKnowledgeBaseJobRequestUserVpc userVpc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>478**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateKnowledgeBaseJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseJobRequest self = new CreateKnowledgeBaseJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseJobRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateKnowledgeBaseJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateKnowledgeBaseJobRequest setEcsSpecs(java.util.List<CreateKnowledgeBaseJobRequestEcsSpecs> ecsSpecs) {
        this.ecsSpecs = ecsSpecs;
        return this;
    }
    public java.util.List<CreateKnowledgeBaseJobRequestEcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    public CreateKnowledgeBaseJobRequest setEmbeddingConfig(CreateKnowledgeBaseJobRequestEmbeddingConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
        return this;
    }
    public CreateKnowledgeBaseJobRequestEmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    public CreateKnowledgeBaseJobRequest setJobAction(String jobAction) {
        this.jobAction = jobAction;
        return this;
    }
    public String getJobAction() {
        return this.jobAction;
    }

    public CreateKnowledgeBaseJobRequest setMaxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
        this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
        return this;
    }
    public Integer getMaxRunningTimeInSeconds() {
        return this.maxRunningTimeInSeconds;
    }

    public CreateKnowledgeBaseJobRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateKnowledgeBaseJobRequest setUserVpc(CreateKnowledgeBaseJobRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public CreateKnowledgeBaseJobRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateKnowledgeBaseJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateKnowledgeBaseJobRequestEcsSpecs extends TeaModel {
        /**
         * <p>CPU核数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>驱动版本</p>
         * 
         * <strong>example:</strong>
         * <p>535.161.08</p>
         */
        @NameInMap("Driver")
        public String driver;

        /**
         * <p>GPU卡数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>内存大小</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>副本数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>Worker</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateKnowledgeBaseJobRequestEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseJobRequestEcsSpecs self = new CreateKnowledgeBaseJobRequestEcsSpecs();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public CreateKnowledgeBaseJobRequestEcsSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateKnowledgeBaseJobRequestEmbeddingConfig extends TeaModel {
        /**
         * <p>Embedding分批大小</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("BatchSize")
        public Integer batchSize;

        /**
         * <p>Embedding并发数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        public static CreateKnowledgeBaseJobRequestEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseJobRequestEmbeddingConfig self = new CreateKnowledgeBaseJobRequestEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseJobRequestEmbeddingConfig setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public CreateKnowledgeBaseJobRequestEmbeddingConfig setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

    }

    public static class CreateKnowledgeBaseJobRequestUserVpc extends TeaModel {
        /**
         * <p>安全组ID</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>交换机ID</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateKnowledgeBaseJobRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateKnowledgeBaseJobRequestUserVpc self = new CreateKnowledgeBaseJobRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateKnowledgeBaseJobRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateKnowledgeBaseJobRequestUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateKnowledgeBaseJobRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
