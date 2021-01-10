// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountLinkedeploycoreDeploycoreAppserviceapplyRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("CodeUrl")
    public String codeUrl;

    @NameInMap("CommandRepeatList")
    public java.util.List<String> commandRepeatList;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("DynamicQuota")
    public Boolean dynamicQuota;

    @NameInMap("Environments")
    public String environments;

    @NameInMap("EnvName")
    public String envName;

    @NameInMap("ExtraRequest")
    public String extraRequest;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Image")
    public String image;

    @NameInMap("JavaOpts")
    public String javaOpts;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("Network")
    public String network;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PureResources")
    public Boolean pureResources;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("Replica")
    public String replica;

    @NameInMap("Runtime")
    public String runtime;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SidecarsRepeatList")
    public java.util.List<String> sidecarsRepeatList;

    @NameInMap("SofaRouter")
    public String sofaRouter;

    @NameInMap("Spanner")
    public Boolean spanner;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("UniqueId")
    public String uniqueId;

    public static MountLinkedeploycoreDeploycoreAppserviceapplyRequest build(java.util.Map<String, ?> map) throws Exception {
        MountLinkedeploycoreDeploycoreAppserviceapplyRequest self = new MountLinkedeploycoreDeploycoreAppserviceapplyRequest();
        return TeaModel.build(map, self);
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
        return this;
    }
    public String getCodeUrl() {
        return this.codeUrl;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setCommandRepeatList(java.util.List<String> commandRepeatList) {
        this.commandRepeatList = commandRepeatList;
        return this;
    }
    public java.util.List<String> getCommandRepeatList() {
        return this.commandRepeatList;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setDynamicQuota(Boolean dynamicQuota) {
        this.dynamicQuota = dynamicQuota;
        return this;
    }
    public Boolean getDynamicQuota() {
        return this.dynamicQuota;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setEnvironments(String environments) {
        this.environments = environments;
        return this;
    }
    public String getEnvironments() {
        return this.environments;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setExtraRequest(String extraRequest) {
        this.extraRequest = extraRequest;
        return this;
    }
    public String getExtraRequest() {
        return this.extraRequest;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setJavaOpts(String javaOpts) {
        this.javaOpts = javaOpts;
        return this;
    }
    public String getJavaOpts() {
        return this.javaOpts;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setPureResources(Boolean pureResources) {
        this.pureResources = pureResources;
        return this;
    }
    public Boolean getPureResources() {
        return this.pureResources;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setReplica(String replica) {
        this.replica = replica;
        return this;
    }
    public String getReplica() {
        return this.replica;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setSidecarsRepeatList(java.util.List<String> sidecarsRepeatList) {
        this.sidecarsRepeatList = sidecarsRepeatList;
        return this;
    }
    public java.util.List<String> getSidecarsRepeatList() {
        return this.sidecarsRepeatList;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setSofaRouter(String sofaRouter) {
        this.sofaRouter = sofaRouter;
        return this;
    }
    public String getSofaRouter() {
        return this.sofaRouter;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setSpanner(Boolean spanner) {
        this.spanner = spanner;
        return this;
    }
    public Boolean getSpanner() {
        return this.spanner;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
