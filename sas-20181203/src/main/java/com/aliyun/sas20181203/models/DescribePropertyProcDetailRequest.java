// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcDetailRequest extends TeaModel {
    /**
     * <p>The startup parameters of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>./8888</p>
     */
    @NameInMap("Cmdline")
    public String cmdline;

    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates that the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether fuzzy match is supported for the process name. Set this parameter to 1 to enable fuzzy match. Other values or an empty value indicate that fuzzy match is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The process name.</p>
     * 
     * <strong>example:</strong>
     * <p>8888</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The token that marks the current position from which to start reading. Leave this parameter empty to start reading from the beginning.</p>
     * <blockquote>
     * <p>You do not need to specify this parameter for the first call. The NextToken value for the second call is included in the response of the first call. Each subsequent response contains the NextToken value for the next call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6k+AtdhNE3kgQEK36GujZ5on+tWdc+4WoaoMP/kUNxxxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>, which indicates that 10 entries of process Asset Fingerprints information are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The end timestamp of the process startup time range. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649587453000</p>
     */
    @NameInMap("ProcTimeEnd")
    public Long procTimeEnd;

    /**
     * <p>The start timestamp of the process startup time range. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1648809853000</p>
     */
    @NameInMap("ProcTimeStart")
    public Long procTimeStart;

    /**
     * <p>The name or IP address of the server that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Specifies whether to use the NextToken method to retrieve the vulnerability list data. If this parameter is used, TotalCount is no longer returned. Valid values:</p>
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
     * <p>The information about the user that runs the process.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>The UUID of the server that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyProcDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcDetailRequest self = new DescribePropertyProcDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcDetailRequest setCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }
    public String getCmdline() {
        return this.cmdline;
    }

    public DescribePropertyProcDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyProcDetailRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribePropertyProcDetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePropertyProcDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePropertyProcDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyProcDetailRequest setProcTimeEnd(Long procTimeEnd) {
        this.procTimeEnd = procTimeEnd;
        return this;
    }
    public Long getProcTimeEnd() {
        return this.procTimeEnd;
    }

    public DescribePropertyProcDetailRequest setProcTimeStart(Long procTimeStart) {
        this.procTimeStart = procTimeStart;
        return this;
    }
    public Long getProcTimeStart() {
        return this.procTimeStart;
    }

    public DescribePropertyProcDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyProcDetailRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribePropertyProcDetailRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public DescribePropertyProcDetailRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public DescribePropertyProcDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
