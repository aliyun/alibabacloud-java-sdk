// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("EnvName")
    public String envName;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TenantName")
    public String tenantName;

    public static QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest self = new QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryimportRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
