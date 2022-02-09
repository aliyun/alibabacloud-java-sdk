// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUsersRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    // 分页查询的页码。 起始值：1 默认值：1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时设置的每页行数。 最大值：100 默认值：10
    @NameInMap("PageSize")
    public Integer pageSize;

    // 查询列表的删选关键字。
    @NameInMap("SearchKey")
    public String searchKey;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    // 数据库账号名称。 不能使用某些预留关键字，如 SYS、root等。
    @NameInMap("UserName")
    public String userName;

    public static DescribeTenantUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUsersRequest self = new DescribeTenantUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUsersRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
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
