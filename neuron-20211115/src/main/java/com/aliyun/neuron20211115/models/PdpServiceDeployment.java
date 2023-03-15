// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServiceDeployment extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

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

    @NameInMap("pipelineTimes")
    public Integer pipelineTimes;

    @NameInMap("repositoryId")
    public String repositoryId;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("rollbackStatus")
    public String rollbackStatus;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("status")
    public String status;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("times")
    public Integer times;

    @NameInMap("type")
    public String type;

    public static PdpServiceDeployment build(java.util.Map<String, ?> map) throws Exception {
        PdpServiceDeployment self = new PdpServiceDeployment();
        return TeaModel.build(map, self);
    }

    public PdpServiceDeployment setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PdpServiceDeployment setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public PdpServiceDeployment setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public PdpServiceDeployment setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public PdpServiceDeployment setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public PdpServiceDeployment setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpServiceDeployment setEdasId(String edasId) {
        this.edasId = edasId;
        return this;
    }
    public String getEdasId() {
        return this.edasId;
    }

    public PdpServiceDeployment setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public PdpServiceDeployment setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PdpServiceDeployment setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PdpServiceDeployment setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PdpServiceDeployment setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpServiceDeployment setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public PdpServiceDeployment setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public PdpServiceDeployment setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public PdpServiceDeployment setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public PdpServiceDeployment setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PdpServiceDeployment setOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }
    public String getOrgType() {
        return this.orgType;
    }

    public PdpServiceDeployment setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public PdpServiceDeployment setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

    public PdpServiceDeployment setPipelineTimes(Integer pipelineTimes) {
        this.pipelineTimes = pipelineTimes;
        return this;
    }
    public Integer getPipelineTimes() {
        return this.pipelineTimes;
    }

    public PdpServiceDeployment setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }
    public String getRepositoryId() {
        return this.repositoryId;
    }

    public PdpServiceDeployment setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpServiceDeployment setRollbackStatus(String rollbackStatus) {
        this.rollbackStatus = rollbackStatus;
        return this;
    }
    public String getRollbackStatus() {
        return this.rollbackStatus;
    }

    public PdpServiceDeployment setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public PdpServiceDeployment setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public PdpServiceDeployment setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PdpServiceDeployment setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public PdpServiceDeployment setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

    public PdpServiceDeployment setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
