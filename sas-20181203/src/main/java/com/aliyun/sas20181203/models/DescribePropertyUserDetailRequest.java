// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserDetailRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the fuzzy search by account name is supported. If you want to use fuzzy search, set the parameter to <strong>1</strong>. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>Specifies whether the account has root permissions. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: no</li>
     * <li><strong>1</strong>: yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsRoot")
    public String isRoot;

    /**
     * <p>The timestamp of the last logoff from the account. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>164922523600</p>
     */
    @NameInMap("LastLoginTimeEnd")
    public Long lastLoginTimeEnd;

    /**
     * <p>The timestamp of the last logon to the account. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>164922523600</p>
     */
    @NameInMap("LastLoginTimeStart")
    public Long lastLoginTimeStart;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The name of the account to which the server belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>bin</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
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

    public DescribePropertyUserDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public DescribePropertyUserDetailRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
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
