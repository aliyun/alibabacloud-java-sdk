// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkefabricFabricReleasepaascheckwithappRequest extends TeaModel {
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

    public static CheckLinkefabricFabricReleasepaascheckwithappRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkefabricFabricReleasepaascheckwithappRequest self = new CheckLinkefabricFabricReleasepaascheckwithappRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setAntxCloseAllSwitch(Boolean antxCloseAllSwitch) {
        this.antxCloseAllSwitch = antxCloseAllSwitch;
        return this;
    }
    public Boolean getAntxCloseAllSwitch() {
        return this.antxCloseAllSwitch;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setCloudInfo(String cloudInfo) {
        this.cloudInfo = cloudInfo;
        return this;
    }
    public String getCloudInfo() {
        return this.cloudInfo;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setDeployHandlerType(String deployHandlerType) {
        this.deployHandlerType = deployHandlerType;
        return this;
    }
    public String getDeployHandlerType() {
        return this.deployHandlerType;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setGrayProjectId(String grayProjectId) {
        this.grayProjectId = grayProjectId;
        return this;
    }
    public String getGrayProjectId() {
        return this.grayProjectId;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setGrayReleaseType(String grayReleaseType) {
        this.grayReleaseType = grayReleaseType;
        return this;
    }
    public String getGrayReleaseType() {
        return this.grayReleaseType;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setPlanTime(String planTime) {
        this.planTime = planTime;
        return this;
    }
    public String getPlanTime() {
        return this.planTime;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setReleaseDomain(String releaseDomain) {
        this.releaseDomain = releaseDomain;
        return this;
    }
    public String getReleaseDomain() {
        return this.releaseDomain;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setReleaseOrderType(String releaseOrderType) {
        this.releaseOrderType = releaseOrderType;
        return this;
    }
    public String getReleaseOrderType() {
        return this.releaseOrderType;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setReleasePubWay(String releasePubWay) {
        this.releasePubWay = releasePubWay;
        return this;
    }
    public String getReleasePubWay() {
        return this.releasePubWay;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setReleaseType(String releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public String getReleaseType() {
        return this.releaseType;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setUseBaseline(Boolean useBaseline) {
        this.useBaseline = useBaseline;
        return this;
    }
    public Boolean getUseBaseline() {
        return this.useBaseline;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setAppsRepeatList(java.util.List<String> appsRepeatList) {
        this.appsRepeatList = appsRepeatList;
        return this;
    }
    public java.util.List<String> getAppsRepeatList() {
        return this.appsRepeatList;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setExecutorListRepeatList(java.util.List<String> executorListRepeatList) {
        this.executorListRepeatList = executorListRepeatList;
        return this;
    }
    public java.util.List<String> getExecutorListRepeatList() {
        return this.executorListRepeatList;
    }

    public CheckLinkefabricFabricReleasepaascheckwithappRequest setPubSeqListRepeatList(java.util.List<String> pubSeqListRepeatList) {
        this.pubSeqListRepeatList = pubSeqListRepeatList;
        return this;
    }
    public java.util.List<String> getPubSeqListRepeatList() {
        return this.pubSeqListRepeatList;
    }

}
