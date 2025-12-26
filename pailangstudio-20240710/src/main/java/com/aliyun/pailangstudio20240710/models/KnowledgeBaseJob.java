// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class KnowledgeBaseJob extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("EcsSpecs")
    public java.util.List<KnowledgeBaseJobEcsSpecs> ecsSpecs;

    @NameInMap("EmbeddingConfig")
    public KnowledgeBaseJobEmbeddingConfig embeddingConfig;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("JobAction")
    public String jobAction;

    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    @NameInMap("KnowledgeBaseJobId")
    public String knowledgeBaseJobId;

    @NameInMap("KnowledgeBaseJobResult")
    public KnowledgeBaseJobKnowledgeBaseJobResult knowledgeBaseJobResult;

    @NameInMap("MaxRunningTimeInSeconds")
    public Integer maxRunningTimeInSeconds;

    @NameInMap("PipelineRunInfo")
    public KnowledgeBaseJobPipelineRunInfo pipelineRunInfo;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserVpc")
    public KnowledgeBaseJobUserVpc userVpc;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static KnowledgeBaseJob build(java.util.Map<String, ?> map) throws Exception {
        KnowledgeBaseJob self = new KnowledgeBaseJob();
        return TeaModel.build(map, self);
    }

    public KnowledgeBaseJob setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public KnowledgeBaseJob setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public KnowledgeBaseJob setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public KnowledgeBaseJob setEcsSpecs(java.util.List<KnowledgeBaseJobEcsSpecs> ecsSpecs) {
        this.ecsSpecs = ecsSpecs;
        return this;
    }
    public java.util.List<KnowledgeBaseJobEcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    public KnowledgeBaseJob setEmbeddingConfig(KnowledgeBaseJobEmbeddingConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
        return this;
    }
    public KnowledgeBaseJobEmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    public KnowledgeBaseJob setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public KnowledgeBaseJob setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public KnowledgeBaseJob setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public KnowledgeBaseJob setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public KnowledgeBaseJob setJobAction(String jobAction) {
        this.jobAction = jobAction;
        return this;
    }
    public String getJobAction() {
        return this.jobAction;
    }

    public KnowledgeBaseJob setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public KnowledgeBaseJob setKnowledgeBaseJobId(String knowledgeBaseJobId) {
        this.knowledgeBaseJobId = knowledgeBaseJobId;
        return this;
    }
    public String getKnowledgeBaseJobId() {
        return this.knowledgeBaseJobId;
    }

    public KnowledgeBaseJob setKnowledgeBaseJobResult(KnowledgeBaseJobKnowledgeBaseJobResult knowledgeBaseJobResult) {
        this.knowledgeBaseJobResult = knowledgeBaseJobResult;
        return this;
    }
    public KnowledgeBaseJobKnowledgeBaseJobResult getKnowledgeBaseJobResult() {
        return this.knowledgeBaseJobResult;
    }

    public KnowledgeBaseJob setMaxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
        this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
        return this;
    }
    public Integer getMaxRunningTimeInSeconds() {
        return this.maxRunningTimeInSeconds;
    }

    public KnowledgeBaseJob setPipelineRunInfo(KnowledgeBaseJobPipelineRunInfo pipelineRunInfo) {
        this.pipelineRunInfo = pipelineRunInfo;
        return this;
    }
    public KnowledgeBaseJobPipelineRunInfo getPipelineRunInfo() {
        return this.pipelineRunInfo;
    }

    public KnowledgeBaseJob setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public KnowledgeBaseJob setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public KnowledgeBaseJob setUserVpc(KnowledgeBaseJobUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public KnowledgeBaseJobUserVpc getUserVpc() {
        return this.userVpc;
    }

    public KnowledgeBaseJob setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class KnowledgeBaseJobEcsSpecs extends TeaModel {
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

        public static KnowledgeBaseJobEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseJobEcsSpecs self = new KnowledgeBaseJobEcsSpecs();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseJobEcsSpecs setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public KnowledgeBaseJobEcsSpecs setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public KnowledgeBaseJobEcsSpecs setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public KnowledgeBaseJobEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public KnowledgeBaseJobEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public KnowledgeBaseJobEcsSpecs setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public KnowledgeBaseJobEcsSpecs setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public KnowledgeBaseJobEcsSpecs setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public KnowledgeBaseJobEcsSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class KnowledgeBaseJobEmbeddingConfig extends TeaModel {
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

        public static KnowledgeBaseJobEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseJobEmbeddingConfig self = new KnowledgeBaseJobEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseJobEmbeddingConfig setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public KnowledgeBaseJobEmbeddingConfig setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

    }

    public static class KnowledgeBaseJobKnowledgeBaseJobResult extends TeaModel {
        /**
         * <p>增加Chunk数量</p>
         */
        @NameInMap("AddChunkCount")
        public Integer addChunkCount;

        /**
         * <p>删除Chunk数量</p>
         */
        @NameInMap("DeleteChunkCount")
        public Integer deleteChunkCount;

        /**
         * <p>总处理文件数</p>
         */
        @NameInMap("TotalFileCount")
        public Integer totalFileCount;

        public static KnowledgeBaseJobKnowledgeBaseJobResult build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseJobKnowledgeBaseJobResult self = new KnowledgeBaseJobKnowledgeBaseJobResult();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseJobKnowledgeBaseJobResult setAddChunkCount(Integer addChunkCount) {
            this.addChunkCount = addChunkCount;
            return this;
        }
        public Integer getAddChunkCount() {
            return this.addChunkCount;
        }

        public KnowledgeBaseJobKnowledgeBaseJobResult setDeleteChunkCount(Integer deleteChunkCount) {
            this.deleteChunkCount = deleteChunkCount;
            return this;
        }
        public Integer getDeleteChunkCount() {
            return this.deleteChunkCount;
        }

        public KnowledgeBaseJobKnowledgeBaseJobResult setTotalFileCount(Integer totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }
        public Integer getTotalFileCount() {
            return this.totalFileCount;
        }

    }

    public static class KnowledgeBaseJobPipelineRunInfo extends TeaModel {
        /**
         * <p>PaiFlow工作流运行ID</p>
         */
        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        public static KnowledgeBaseJobPipelineRunInfo build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseJobPipelineRunInfo self = new KnowledgeBaseJobPipelineRunInfo();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseJobPipelineRunInfo setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

    }

    public static class KnowledgeBaseJobUserVpc extends TeaModel {
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
         * <p>VPC ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static KnowledgeBaseJobUserVpc build(java.util.Map<String, ?> map) throws Exception {
            KnowledgeBaseJobUserVpc self = new KnowledgeBaseJobUserVpc();
            return TeaModel.build(map, self);
        }

        public KnowledgeBaseJobUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public KnowledgeBaseJobUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public KnowledgeBaseJobUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
