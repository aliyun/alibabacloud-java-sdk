// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkefabricFabricReleasepaascheckRequest extends TeaModel {
    @NameInMap("AntxCloseAllSwitch")
    public Boolean antxCloseAllSwitch;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CloudInfo")
    public String cloudInfo;

    @NameInMap("DeployHandlerType")
    public String deployHandlerType;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("GrayProjectId")
    public String grayProjectId;

    @NameInMap("GrayReleaseType")
    public String grayReleaseType;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("PlanTime")
    public String planTime;

    @NameInMap("ReleaseDomain")
    public String releaseDomain;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("ReleaseOrderType")
    public String releaseOrderType;

    @NameInMap("ReleasePubWay")
    public String releasePubWay;

    @NameInMap("ReleaseType")
    public String releaseType;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UseBaseline")
    public Boolean useBaseline;

    @NameInMap("AppsRepeatList")
    public java.util.List<String> appsRepeatList;

    @NameInMap("ExecutorListRepeatList")
    public java.util.List<String> executorListRepeatList;

    @NameInMap("PubSeqListRepeatList")
    public java.util.List<String> pubSeqListRepeatList;

    public static CheckLinkefabricFabricReleasepaascheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkefabricFabricReleasepaascheckRequest self = new CheckLinkefabricFabricReleasepaascheckRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setAntxCloseAllSwitch(Boolean antxCloseAllSwitch) {
        this.antxCloseAllSwitch = antxCloseAllSwitch;
        return this;
    }
    public Boolean getAntxCloseAllSwitch() {
        return this.antxCloseAllSwitch;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setCloudInfo(String cloudInfo) {
        this.cloudInfo = cloudInfo;
        return this;
    }
    public String getCloudInfo() {
        return this.cloudInfo;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setDeployHandlerType(String deployHandlerType) {
        this.deployHandlerType = deployHandlerType;
        return this;
    }
    public String getDeployHandlerType() {
        return this.deployHandlerType;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setGrayProjectId(String grayProjectId) {
        this.grayProjectId = grayProjectId;
        return this;
    }
    public String getGrayProjectId() {
        return this.grayProjectId;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setGrayReleaseType(String grayReleaseType) {
        this.grayReleaseType = grayReleaseType;
        return this;
    }
    public String getGrayReleaseType() {
        return this.grayReleaseType;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setPlanTime(String planTime) {
        this.planTime = planTime;
        return this;
    }
    public String getPlanTime() {
        return this.planTime;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setReleaseDomain(String releaseDomain) {
        this.releaseDomain = releaseDomain;
        return this;
    }
    public String getReleaseDomain() {
        return this.releaseDomain;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setReleaseOrderType(String releaseOrderType) {
        this.releaseOrderType = releaseOrderType;
        return this;
    }
    public String getReleaseOrderType() {
        return this.releaseOrderType;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setReleasePubWay(String releasePubWay) {
        this.releasePubWay = releasePubWay;
        return this;
    }
    public String getReleasePubWay() {
        return this.releasePubWay;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setReleaseType(String releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public String getReleaseType() {
        return this.releaseType;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setUseBaseline(Boolean useBaseline) {
        this.useBaseline = useBaseline;
        return this;
    }
    public Boolean getUseBaseline() {
        return this.useBaseline;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setAppsRepeatList(java.util.List<String> appsRepeatList) {
        this.appsRepeatList = appsRepeatList;
        return this;
    }
    public java.util.List<String> getAppsRepeatList() {
        return this.appsRepeatList;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setExecutorListRepeatList(java.util.List<String> executorListRepeatList) {
        this.executorListRepeatList = executorListRepeatList;
        return this;
    }
    public java.util.List<String> getExecutorListRepeatList() {
        return this.executorListRepeatList;
    }

    public CheckLinkefabricFabricReleasepaascheckRequest setPubSeqListRepeatList(java.util.List<String> pubSeqListRepeatList) {
        this.pubSeqListRepeatList = pubSeqListRepeatList;
        return this;
    }
    public java.util.List<String> getPubSeqListRepeatList() {
        return this.pubSeqListRepeatList;
    }

}
