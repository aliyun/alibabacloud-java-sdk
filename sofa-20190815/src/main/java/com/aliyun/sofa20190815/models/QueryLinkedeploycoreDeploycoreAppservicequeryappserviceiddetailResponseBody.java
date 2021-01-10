// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody self = new QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBody setData(QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData extends TeaModel {
        @NameInMap("ApplyOwner")
        public String applyOwner;

        @NameInMap("AppInstanceGroup")
        public String appInstanceGroup;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppServiceName")
        public String appServiceName;

        @NameInMap("BranchName")
        public String branchName;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CodeUrl")
        public String codeUrl;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CpuLimit")
        public String cpuLimit;

        @NameInMap("CpuRequest")
        public String cpuRequest;

        @NameInMap("EnvName")
        public String envName;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("FirstCreate")
        public Boolean firstCreate;

        @NameInMap("FromApp")
        public String fromApp;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Image")
        public String image;

        @NameInMap("MemoryLimit")
        public String memoryLimit;

        @NameInMap("MemoryRequest")
        public String memoryRequest;

        @NameInMap("Meta")
        public String meta;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PaasDetailUrl")
        public String paasDetailUrl;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Replicas")
        public Long replicas;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("UniqueId")
        public String uniqueId;

        public static QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData self = new QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setApplyOwner(String applyOwner) {
            this.applyOwner = applyOwner;
            return this;
        }
        public String getApplyOwner() {
            return this.applyOwner;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setAppInstanceGroup(String appInstanceGroup) {
            this.appInstanceGroup = appInstanceGroup;
            return this;
        }
        public String getAppInstanceGroup() {
            return this.appInstanceGroup;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setAppServiceName(String appServiceName) {
            this.appServiceName = appServiceName;
            return this;
        }
        public String getAppServiceName() {
            return this.appServiceName;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setCodeUrl(String codeUrl) {
            this.codeUrl = codeUrl;
            return this;
        }
        public String getCodeUrl() {
            return this.codeUrl;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setFirstCreate(Boolean firstCreate) {
            this.firstCreate = firstCreate;
            return this;
        }
        public Boolean getFirstCreate() {
            return this.firstCreate;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setFromApp(String fromApp) {
            this.fromApp = fromApp;
            return this;
        }
        public String getFromApp() {
            return this.fromApp;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setPaasDetailUrl(String paasDetailUrl) {
            this.paasDetailUrl = paasDetailUrl;
            return this;
        }
        public String getPaasDetailUrl() {
            return this.paasDetailUrl;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setReplicas(Long replicas) {
            this.replicas = replicas;
            return this;
        }
        public Long getReplicas() {
            return this.replicas;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryappserviceiddetailResponseBodyData setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

}
