// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronDetailRequest extends TeaModel {
    /**
     * <p>The page number of the results to return. Default value: <strong>1</strong>, which indicates that the results start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether fuzzy match is supported for the scheduled task path. Set this parameter to <strong>1</strong> to enable fuzzy match. Other values or an empty value indicate that fuzzy match is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The token that marks the current position from which to start reading. Leave this parameter empty to start reading from the beginning.</p>
     * <blockquote>
     * <p>You do not need to specify this parameter for the first call. The response includes the NextToken value for the second call. Each subsequent response includes the NextToken value for the next call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1426C575705AE8545E8360A6EFA3B***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Settings the number of entries per page in a paging query. Default value: <strong>10</strong>, which indicates that 10 fingerprint entries of scheduled task assets are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server to query.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The path of the scheduled task to query.</p>
     * 
     * <strong>example:</strong>
     * <p>/etc/cron.d/root</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Specifies whether to use the NextToken method to retrieve the vulnerability list data. If you use this parameter, TotalCount is no longer returned. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Use the NextToken method.</li>
     * <li><strong>false</strong>: Do not use the NextToken method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The account name of the scheduled task to query.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The UUID of the server to query.</p>
     * 
     * <strong>example:</strong>
     * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyCronDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCronDetailRequest self = new DescribePropertyCronDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCronDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyCronDetailRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribePropertyCronDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePropertyCronDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyCronDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyCronDetailRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribePropertyCronDetailRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribePropertyCronDetailRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public DescribePropertyCronDetailRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public DescribePropertyCronDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
