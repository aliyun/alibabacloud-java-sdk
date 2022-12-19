// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVulAutoRepairConfigRequest extends TeaModel {
    // The alias of the vulnerability.
    @NameInMap("AliasName")
    public String aliasName;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The type of the vulnerability. Valid values:
    // 
    // *   **cve**: Linux software vulnerability
    // *   **sys**: Windows system vulnerability
    @NameInMap("Type")
    public String type;

    public static ListVulAutoRepairConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVulAutoRepairConfigRequest self = new ListVulAutoRepairConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListVulAutoRepairConfigRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public ListVulAutoRepairConfigRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListVulAutoRepairConfigRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVulAutoRepairConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
