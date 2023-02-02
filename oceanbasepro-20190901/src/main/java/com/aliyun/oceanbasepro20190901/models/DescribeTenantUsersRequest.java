// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUsersRequest extends TeaModel {
    /**
     * <p>The number of the page to return.    </p>
     * <p>Start value: 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows to return on each page.    </p>
     * <p>Maximum value: 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The name of the database account.    </p>
     * <p>You cannot use reserved keywords, such as SYS and root.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static DescribeTenantUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUsersRequest self = new DescribeTenantUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUsersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTenantUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTenantUsersRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeTenantUsersRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeTenantUsersRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
