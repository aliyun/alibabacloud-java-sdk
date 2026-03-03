// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServiceDeployment extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdad</p>
     */
    @NameInMap("edasId")
    public String edasId;

    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>This parameter is required.</p>
     * 
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

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("isServiceGroupEnable")
    public Integer isServiceGroupEnable;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pbcId")
    public Long pbcId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>management</p>
     */
    @NameInMap("pbcName")
    public String pbcName;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("pipelineTimes")
    public Integer pipelineTimes;

    /**
     * <strong>example:</strong>
     * <p>cri-v1d49e57e8ojcwpq</p>
     */
    @NameInMap("repositoryId")
    public String repositoryId;

    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>DEPLOYMENT_PENDING</p>
     */
    @NameInMap("rollbackStatus")
    public String rollbackStatus;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>employee</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEPLOYMENT_PENDING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
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

    public PdpServiceDeployment setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
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

    public PdpServiceDeployment setIsServiceGroupEnable(Integer isServiceGroupEnable) {
        this.isServiceGroupEnable = isServiceGroupEnable;
        return this;
    }
    public Integer getIsServiceGroupEnable() {
        return this.isServiceGroupEnable;
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

    public PdpServiceDeployment setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
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
