// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>project name pass the check</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EcsSpecs")
    public java.util.List<GetKnowledgeBaseJobResponseBodyEcsSpecs> ecsSpecs;

    @NameInMap("EmbeddingConfig")
    public GetKnowledgeBaseJobResponseBodyEmbeddingConfig embeddingConfig;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>2025-09-24T07:33:53Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2025-02-08T15:45:12Z</p>
     */
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    /**
     * <strong>example:</strong>
     * <p>2025-06-11T08:58:35.438Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>UpdateScheduleConfig</p>
     */
    @NameInMap("JobAction")
    public String jobAction;

    /**
     * <strong>example:</strong>
     * <p>d-nacr******sxd2</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <strong>example:</strong>
     * <p>kbjob-9m******54</p>
     */
    @NameInMap("KnowledgeBaseJobId")
    public String knowledgeBaseJobId;

    @NameInMap("KnowledgeBaseJobResult")
    public GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult knowledgeBaseJobResult;

    /**
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("MaxRunningTimeInSeconds")
    public Integer maxRunningTimeInSeconds;

    @NameInMap("PipelineRunInfo")
    public GetKnowledgeBaseJobResponseBodyPipelineRunInfo pipelineRunInfo;

    /**
     * <strong>example:</strong>
     * <p>C25324E3-18E6-50D8-9026-16D74AAEEB26</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>discovering</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("UserVpc")
    public GetKnowledgeBaseJobResponseBodyUserVpc userVpc;

    /**
     * <strong>example:</strong>
     * <p>478***</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetKnowledgeBaseJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseJobResponseBody self = new GetKnowledgeBaseJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseJobResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetKnowledgeBaseJobResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetKnowledgeBaseJobResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetKnowledgeBaseJobResponseBody setEcsSpecs(java.util.List<GetKnowledgeBaseJobResponseBodyEcsSpecs> ecsSpecs) {
        this.ecsSpecs = ecsSpecs;
        return this;
    }
    public java.util.List<GetKnowledgeBaseJobResponseBodyEcsSpecs> getEcsSpecs() {
        return this.ecsSpecs;
    }

    public GetKnowledgeBaseJobResponseBody setEmbeddingConfig(GetKnowledgeBaseJobResponseBodyEmbeddingConfig embeddingConfig) {
        this.embeddingConfig = embeddingConfig;
        return this;
    }
    public GetKnowledgeBaseJobResponseBodyEmbeddingConfig getEmbeddingConfig() {
        return this.embeddingConfig;
    }

    public GetKnowledgeBaseJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetKnowledgeBaseJobResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetKnowledgeBaseJobResponseBody setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public GetKnowledgeBaseJobResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetKnowledgeBaseJobResponseBody setJobAction(String jobAction) {
        this.jobAction = jobAction;
        return this;
    }
    public String getJobAction() {
        return this.jobAction;
    }

    public GetKnowledgeBaseJobResponseBody setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public GetKnowledgeBaseJobResponseBody setKnowledgeBaseJobId(String knowledgeBaseJobId) {
        this.knowledgeBaseJobId = knowledgeBaseJobId;
        return this;
    }
    public String getKnowledgeBaseJobId() {
        return this.knowledgeBaseJobId;
    }

    public GetKnowledgeBaseJobResponseBody setKnowledgeBaseJobResult(GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult knowledgeBaseJobResult) {
        this.knowledgeBaseJobResult = knowledgeBaseJobResult;
        return this;
    }
    public GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult getKnowledgeBaseJobResult() {
        return this.knowledgeBaseJobResult;
    }

    public GetKnowledgeBaseJobResponseBody setMaxRunningTimeInSeconds(Integer maxRunningTimeInSeconds) {
        this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
        return this;
    }
    public Integer getMaxRunningTimeInSeconds() {
        return this.maxRunningTimeInSeconds;
    }

    public GetKnowledgeBaseJobResponseBody setPipelineRunInfo(GetKnowledgeBaseJobResponseBodyPipelineRunInfo pipelineRunInfo) {
        this.pipelineRunInfo = pipelineRunInfo;
        return this;
    }
    public GetKnowledgeBaseJobResponseBodyPipelineRunInfo getPipelineRunInfo() {
        return this.pipelineRunInfo;
    }

    public GetKnowledgeBaseJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeBaseJobResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetKnowledgeBaseJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetKnowledgeBaseJobResponseBody setUserVpc(GetKnowledgeBaseJobResponseBodyUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public GetKnowledgeBaseJobResponseBodyUserVpc getUserVpc() {
        return this.userVpc;
    }

    public GetKnowledgeBaseJobResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetKnowledgeBaseJobResponseBodyEcsSpecs extends TeaModel {
        /**
         * <p>CPU核数</p>
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

        public static GetKnowledgeBaseJobResponseBodyEcsSpecs build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseJobResponseBodyEcsSpecs self = new GetKnowledgeBaseJobResponseBodyEcsSpecs();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setDriver(String driver) {
            this.driver = driver;
            return this;
        }
        public String getDriver() {
            return this.driver;
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public GetKnowledgeBaseJobResponseBodyEcsSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetKnowledgeBaseJobResponseBodyEmbeddingConfig extends TeaModel {
        /**
         * <p>Embedding分批大小</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BatchSize")
        public Integer batchSize;

        /**
         * <p>Embedding并发数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        public static GetKnowledgeBaseJobResponseBodyEmbeddingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseJobResponseBodyEmbeddingConfig self = new GetKnowledgeBaseJobResponseBodyEmbeddingConfig();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseJobResponseBodyEmbeddingConfig setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public GetKnowledgeBaseJobResponseBodyEmbeddingConfig setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

    }

    public static class GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult extends TeaModel {
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

        public static GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult self = new GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult setAddChunkCount(Integer addChunkCount) {
            this.addChunkCount = addChunkCount;
            return this;
        }
        public Integer getAddChunkCount() {
            return this.addChunkCount;
        }

        public GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult setDeleteChunkCount(Integer deleteChunkCount) {
            this.deleteChunkCount = deleteChunkCount;
            return this;
        }
        public Integer getDeleteChunkCount() {
            return this.deleteChunkCount;
        }

        public GetKnowledgeBaseJobResponseBodyKnowledgeBaseJobResult setTotalFileCount(Integer totalFileCount) {
            this.totalFileCount = totalFileCount;
            return this;
        }
        public Integer getTotalFileCount() {
            return this.totalFileCount;
        }

    }

    public static class GetKnowledgeBaseJobResponseBodyPipelineRunInfo extends TeaModel {
        /**
         * <p>PaiFlow工作流运行ID</p>
         * 
         * <strong>example:</strong>
         * <p>flow-fi8z******g4gy</p>
         */
        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        public static GetKnowledgeBaseJobResponseBodyPipelineRunInfo build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseJobResponseBodyPipelineRunInfo self = new GetKnowledgeBaseJobResponseBodyPipelineRunInfo();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseJobResponseBodyPipelineRunInfo setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

    }

    public static class GetKnowledgeBaseJobResponseBodyUserVpc extends TeaModel {
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

        public static GetKnowledgeBaseJobResponseBodyUserVpc build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseJobResponseBodyUserVpc self = new GetKnowledgeBaseJobResponseBodyUserVpc();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseJobResponseBodyUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetKnowledgeBaseJobResponseBodyUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetKnowledgeBaseJobResponseBodyUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
