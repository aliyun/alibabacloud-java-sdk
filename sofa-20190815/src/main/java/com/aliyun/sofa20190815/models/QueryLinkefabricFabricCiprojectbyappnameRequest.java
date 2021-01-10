// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCiprojectbyappnameRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("CiConfigId")
    public String ciConfigId;

    @NameInMap("DevStage")
    public String devStage;

    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Env")
    public String env;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("IsProdUrl")
    public Boolean isProdUrl;

    @NameInMap("IsPublic")
    public Boolean isPublic;

    @NameInMap("NeedTransfer")
    public Boolean needTransfer;

    @NameInMap("NotifyDevStage")
    public String notifyDevStage;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("OriginAppName")
    public String originAppName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("QueryAll")
    public Boolean queryAll;

    @NameInMap("QueryChange")
    public Boolean queryChange;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("TypeName")
    public String typeName;

    public static QueryLinkefabricFabricCiprojectbyappnameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCiprojectbyappnameRequest self = new QueryLinkefabricFabricCiprojectbyappnameRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setCiConfigId(String ciConfigId) {
        this.ciConfigId = ciConfigId;
        return this;
    }
    public String getCiConfigId() {
        return this.ciConfigId;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setIsProdUrl(Boolean isProdUrl) {
        this.isProdUrl = isProdUrl;
        return this;
    }
    public Boolean getIsProdUrl() {
        return this.isProdUrl;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setNeedTransfer(Boolean needTransfer) {
        this.needTransfer = needTransfer;
        return this;
    }
    public Boolean getNeedTransfer() {
        return this.needTransfer;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setNotifyDevStage(String notifyDevStage) {
        this.notifyDevStage = notifyDevStage;
        return this;
    }
    public String getNotifyDevStage() {
        return this.notifyDevStage;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setOriginAppName(String originAppName) {
        this.originAppName = originAppName;
        return this;
    }
    public String getOriginAppName() {
        return this.originAppName;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }
    public Boolean getQueryAll() {
        return this.queryAll;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setQueryChange(Boolean queryChange) {
        this.queryChange = queryChange;
        return this;
    }
    public Boolean getQueryChange() {
        return this.queryChange;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryLinkefabricFabricCiprojectbyappnameRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

}
