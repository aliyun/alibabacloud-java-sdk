// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequeryRequest extends TeaModel {
    @NameInMap("AppNamesRepeatList")
    public java.util.List<String> appNamesRepeatList;

    @NameInMap("AppServiceIdsRepeatList")
    public java.util.List<Long> appServiceIdsRepeatList;

    @NameInMap("Condition")
    public String condition;

    @NameInMap("CurrentUser")
    public String currentUser;

    @NameInMap("EnvName")
    public String envName;

    @NameInMap("ExcludeFromAppsRepeatList")
    public java.util.List<String> excludeFromAppsRepeatList;

    @NameInMap("FromAppsRepeatList")
    public java.util.List<String> fromAppsRepeatList;

    @NameInMap("FuzzyAppName")
    public String fuzzyAppName;

    @NameInMap("FuzzyName")
    public String fuzzyName;

    @NameInMap("FuzzyProjectId")
    public String fuzzyProjectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectIdsRepeatList")
    public java.util.List<String> projectIdsRepeatList;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("UsersRepeatList")
    public java.util.List<String> usersRepeatList;

    public static QueryLinkedeploycoreDeploycoreAppservicequeryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequeryRequest self = new QueryLinkedeploycoreDeploycoreAppservicequeryRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setAppNamesRepeatList(java.util.List<String> appNamesRepeatList) {
        this.appNamesRepeatList = appNamesRepeatList;
        return this;
    }
    public java.util.List<String> getAppNamesRepeatList() {
        return this.appNamesRepeatList;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setAppServiceIdsRepeatList(java.util.List<Long> appServiceIdsRepeatList) {
        this.appServiceIdsRepeatList = appServiceIdsRepeatList;
        return this;
    }
    public java.util.List<Long> getAppServiceIdsRepeatList() {
        return this.appServiceIdsRepeatList;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
        return this;
    }
    public String getCurrentUser() {
        return this.currentUser;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setExcludeFromAppsRepeatList(java.util.List<String> excludeFromAppsRepeatList) {
        this.excludeFromAppsRepeatList = excludeFromAppsRepeatList;
        return this;
    }
    public java.util.List<String> getExcludeFromAppsRepeatList() {
        return this.excludeFromAppsRepeatList;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setFromAppsRepeatList(java.util.List<String> fromAppsRepeatList) {
        this.fromAppsRepeatList = fromAppsRepeatList;
        return this;
    }
    public java.util.List<String> getFromAppsRepeatList() {
        return this.fromAppsRepeatList;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setFuzzyAppName(String fuzzyAppName) {
        this.fuzzyAppName = fuzzyAppName;
        return this;
    }
    public String getFuzzyAppName() {
        return this.fuzzyAppName;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
        return this;
    }
    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setFuzzyProjectId(String fuzzyProjectId) {
        this.fuzzyProjectId = fuzzyProjectId;
        return this;
    }
    public String getFuzzyProjectId() {
        return this.fuzzyProjectId;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setProjectIdsRepeatList(java.util.List<String> projectIdsRepeatList) {
        this.projectIdsRepeatList = projectIdsRepeatList;
        return this;
    }
    public java.util.List<String> getProjectIdsRepeatList() {
        return this.projectIdsRepeatList;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryRequest setUsersRepeatList(java.util.List<String> usersRepeatList) {
        this.usersRepeatList = usersRepeatList;
        return this;
    }
    public java.util.List<String> getUsersRepeatList() {
        return this.usersRepeatList;
    }

}
