// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeployDetailInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>account1</p>
     */
    @NameInMap("accountName")
    public String accountName;

    /**
     * <strong>example:</strong>
     * <p>MULTI_TENANT_DAPR</p>
     */
    @NameInMap("applicationType")
    public String applicationType;

    /**
     * <strong>example:</strong>
     * <p>cd65b247-****-475b-ad4b-7039040d625c</p>
     */
    @NameInMap("changeOrderId")
    public String changeOrderId;

    @NameInMap("context")
    public String context;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Integer cpu;

    /**
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("deploymentType")
    public String deploymentType;

    /**
     * <strong>example:</strong>
     * <p>部署员工管理</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>sdad</p>
     */
    @NameInMap("edasId")
    public String edasId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>2022-2-22 11:11:2</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2022-2-22 11:11:2</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-v12wpq</p>
     */
    @NameInMap("imageId")
    public String imageId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20220421100717_prepub</p>
     */
    @NameInMap("imageTag")
    public String imageTag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("instanceCount")
    public Integer instanceCount;

    @NameInMap("isMonitorEnable")
    public Integer isMonitorEnable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("memory")
    public Integer memory;

    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("orgType")
    public String orgType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pbcId")
    public Long pbcId;

    /**
     * <strong>example:</strong>
     * <p>management</p>
     */
    @NameInMap("pbcName")
    public String pbcName;

    /**
     * <strong>example:</strong>
     * <p>123141</p>
     */
    @NameInMap("pipelineId")
    public String pipelineId;

    @NameInMap("pipelineInfos")
    public java.util.List<DeployPipelineInfo> pipelineInfos;

    /**
     * <strong>example:</strong>
     * <p>23131</p>
     */
    @NameInMap("pipelineRunId")
    public String pipelineRunId;

    /**
     * <strong>example:</strong>
     * <p>cri-v1d49e57e8ojcwpq</p>
     */
    @NameInMap("repositoryId")
    public String repositoryId;

    /**
     * <strong>example:</strong>
     * <p>DEPLOYMENT_PENDING</p>
     */
    @NameInMap("rollbackStatus")
    public String rollbackStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    /**
     * <strong>example:</strong>
     * <p>employee</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <strong>example:</strong>
     * <p>DEPLOYMENT_PENDING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("times")
    public Integer times;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SERVICE</p>
     */
    @NameInMap("type")
    public String type;

    public static DeployDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        DeployDetailInfo self = new DeployDetailInfo();
        return TeaModel.build(map, self);
    }

    public DeployDetailInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeployDetailInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DeployDetailInfo setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DeployDetailInfo setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public DeployDetailInfo setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public DeployDetailInfo setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DeployDetailInfo setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DeployDetailInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeployDetailInfo setEdasId(String edasId) {
        this.edasId = edasId;
        return this;
    }
    public String getEdasId() {
        return this.edasId;
    }

    public DeployDetailInfo setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public DeployDetailInfo setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DeployDetailInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DeployDetailInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DeployDetailInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeployDetailInfo setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DeployDetailInfo setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DeployDetailInfo setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public DeployDetailInfo setIsMonitorEnable(Integer isMonitorEnable) {
        this.isMonitorEnable = isMonitorEnable;
        return this;
    }
    public Integer getIsMonitorEnable() {
        return this.isMonitorEnable;
    }

    public DeployDetailInfo setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DeployDetailInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeployDetailInfo setOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }
    public String getOrgType() {
        return this.orgType;
    }

    public DeployDetailInfo setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public DeployDetailInfo setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public DeployDetailInfo setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public DeployDetailInfo setPipelineInfos(java.util.List<DeployPipelineInfo> pipelineInfos) {
        this.pipelineInfos = pipelineInfos;
        return this;
    }
    public java.util.List<DeployPipelineInfo> getPipelineInfos() {
        return this.pipelineInfos;
    }

    public DeployDetailInfo setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public DeployDetailInfo setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }
    public String getRepositoryId() {
        return this.repositoryId;
    }

    public DeployDetailInfo setRollbackStatus(String rollbackStatus) {
        this.rollbackStatus = rollbackStatus;
        return this;
    }
    public String getRollbackStatus() {
        return this.rollbackStatus;
    }

    public DeployDetailInfo setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public DeployDetailInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DeployDetailInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeployDetailInfo setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

    public DeployDetailInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
