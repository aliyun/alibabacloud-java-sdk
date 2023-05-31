// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserDetailRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the fuzzy search by account name is supported. If you want to use fuzzy search, set the parameter to **1**. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>Specifies whether the account has root permissions. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("IsRoot")
    public String isRoot;

    /**
     * <p>The timestamp of the last logoff from the account. Unit: milliseconds.</p>
     */
    @NameInMap("LastLoginTimeEnd")
    public Long lastLoginTimeEnd;

    /**
     * <p>The timestamp of the last logon to the account. Unit: milliseconds.</p>
     */
    @NameInMap("LastLoginTimeStart")
    public Long lastLoginTimeStart;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The name of the account to which the server belongs.</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The UUID of the server.</p>
     */
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
