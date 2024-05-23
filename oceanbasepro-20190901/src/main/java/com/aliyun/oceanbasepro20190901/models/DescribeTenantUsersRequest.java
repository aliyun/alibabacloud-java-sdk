// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUsersRequest extends TeaModel {
    /**
     * <p>The database privileges of the account.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The return result of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The operation that you want to perform.   </p>
     * <p>Set the value to **DescribeTenantUsers**.</p>
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
