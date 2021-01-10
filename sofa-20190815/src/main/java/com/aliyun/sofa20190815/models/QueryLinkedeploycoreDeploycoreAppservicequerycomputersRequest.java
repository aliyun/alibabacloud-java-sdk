// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequerycomputersRequest extends TeaModel {
    @NameInMap("EnvName")
    public String envName;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TenantName")
    public String tenantName;

    public static QueryLinkedeploycoreDeploycoreAppservicequerycomputersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequerycomputersRequest self = new QueryLinkedeploycoreDeploycoreAppservicequerycomputersRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequerycomputersRequest setEnvName(String envName) {
        this.envName = envName;
        return this;
    }
    public String getEnvName() {
        return this.envName;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequerycomputersRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequerycomputersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequerycomputersRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
