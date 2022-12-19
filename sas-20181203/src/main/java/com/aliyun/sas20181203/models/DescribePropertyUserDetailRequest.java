// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserDetailRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether the fuzzy search by account name is supported. If you want to use fuzzy search, set the parameter to **1**. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.
    @NameInMap("Extend")
    public String extend;

    // Specifies whether the account has root permissions. Valid values:
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("IsRoot")
    public String isRoot;

    // The timestamp of the last logoff from the account. Unit: milliseconds.
    @NameInMap("LastLoginTimeEnd")
    public Long lastLoginTimeEnd;

    // The timestamp of the last logon to the account. Unit: milliseconds.
    @NameInMap("LastLoginTimeStart")
    public Long lastLoginTimeStart;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The name or IP address of the server.
    @NameInMap("Remark")
    public String remark;

    // The name of the account to which the server belongs.
    @NameInMap("User")
    public String user;

    // The UUID of the server.
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyUserDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUserDetailRequest self = new DescribePropertyUserDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUserDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyUserDetailRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribePropertyUserDetailRequest setIsRoot(String isRoot) {
        this.isRoot = isRoot;
        return this;
    }
    public String getIsRoot() {
        return this.isRoot;
    }

    public DescribePropertyUserDetailRequest setLastLoginTimeEnd(Long lastLoginTimeEnd) {
        this.lastLoginTimeEnd = lastLoginTimeEnd;
        return this;
    }
    public Long getLastLoginTimeEnd() {
        return this.lastLoginTimeEnd;
    }

    public DescribePropertyUserDetailRequest setLastLoginTimeStart(Long lastLoginTimeStart) {
        this.lastLoginTimeStart = lastLoginTimeStart;
        return this;
    }
    public Long getLastLoginTimeStart() {
        return this.lastLoginTimeStart;
    }

    public DescribePropertyUserDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyUserDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyUserDetailRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public DescribePropertyUserDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
