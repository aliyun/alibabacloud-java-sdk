// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppquerybranchRequest extends TeaModel {
    @NameInMap("AppNamesRepeatList")
    public java.util.List<String> appNamesRepeatList;

    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("Condition")
    public String condition;

    @NameInMap("EnvNamesRepeatList")
    public java.util.List<String> envNamesRepeatList;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("TenantName")
    public String tenantName;

    public static QueryLinkedeploycoreDeploycoreAppquerybranchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppquerybranchRequest self = new QueryLinkedeploycoreDeploycoreAppquerybranchRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchRequest setAppNamesRepeatList(java.util.List<String> appNamesRepeatList) {
        this.appNamesRepeatList = appNamesRepeatList;
        return this;
    }
    public java.util.List<String> getAppNamesRepeatList() {
        return this.appNamesRepeatList;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchRequest setEnvNamesRepeatList(java.util.List<String> envNamesRepeatList) {
        this.envNamesRepeatList = envNamesRepeatList;
        return this;
    }
    public java.util.List<String> getEnvNamesRepeatList() {
        return this.envNamesRepeatList;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
