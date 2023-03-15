// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeployDetailInfo extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("accountName")
    public String accountName;

    @NameInMap("changeOrderId")
    public String changeOrderId;

    @NameInMap("context")
    public String context;

    @NameInMap("cpu")
    public Integer cpu;

    @NameInMap("deploymentType")
    public String deploymentType;

    @NameInMap("description")
    public String description;

    @NameInMap("edasId")
    public String edasId;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("env")
    public String env;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("id")
    public Long id;

    @NameInMap("imageId")
    public String imageId;

    @NameInMap("imageTag")
    public String imageTag;

    @NameInMap("instanceCount")
    public Integer instanceCount;

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("message")
    public String message;

    @NameInMap("orgType")
    public String orgType;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("pbcName")
    public String pbcName;

    @NameInMap("pipelineId")
    public String pipelineId;

    @NameInMap("pipelineInfos")
    public java.util.List<DeployPipelineInfo> pipelineInfos;

    @NameInMap("pipelineRunId")
    public String pipelineRunId;

    @NameInMap("repositoryId")
    public String repositoryId;

    @NameInMap("rollbackStatus")
    public String rollbackStatus;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("status")
    public String status;

    @NameInMap("times")
    public Integer times;

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
