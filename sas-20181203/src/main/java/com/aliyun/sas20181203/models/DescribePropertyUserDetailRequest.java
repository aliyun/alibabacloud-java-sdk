// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserDetailRequest extends TeaModel {
    /**
     * <p>Set which page of the returned results to start displaying the query results. The default value is <strong>1</strong>, indicating that the display starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Whether the account name supports fuzzy search. To enable fuzzy search, set this parameter\&quot;s value to <strong>1</strong>; other values or an empty value indicate that fuzzy search is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>Whether the queried account has ROOT privileges. Possible values include:</p>
     * <ul>
     * <li><strong>0</strong>: No</li>
     * <li><strong>1</strong>: Yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsRoot")
    public String isRoot;

    /**
     * <p>The end timestamp for the last login retrieval. The unit is milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1651298836000</p>
     */
    @NameInMap("LastLoginTimeEnd")
    public Long lastLoginTimeEnd;

    /**
     * <p>The start timestamp for the last login retrieval. The unit is milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>164922523600</p>
     */
    @NameInMap("LastLoginTimeStart")
    public Long lastLoginTimeStart;

    /**
     * <p>Used to mark the starting position for reading. Leave it empty to start from the beginning.</p>
     * <blockquote>
     * <p>For the first call, you do not need to fill in this field. The response will include the NextToken for the second call, and each subsequent call will include the NextToken for the next call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>E17B501887A2D3AA5E8360A6EFA3B***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Set the number of account asset fingerprint information items to display per page during pagination. The default value is <strong>10</strong>, indicating that 10 items of account asset fingerprint information are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Whether to use the NextToken method to fetch vulnerability list data. If this parameter is used, TotalCount will no longer be returned. Possible values:</p>
     * <ul>
     * <li><strong>true</strong>: Use the NextToken method.</li>
     * <li><strong>false</strong>: Do not use the NextToken method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The account name of the server to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>bin</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The UUID of the server to be queried.</p>
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
