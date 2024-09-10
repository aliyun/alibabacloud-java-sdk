// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListRequest extends TeaModel {
    /**
     * <p>The name of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>RHSA-2019:0230-Important: polkit security update</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The additional type of the vulnerabilities. You need to specify this parameter when you query application vulnerabilities. Set the value to <strong>sca</strong>. If you set <strong>Type</strong> to <strong>app</strong>, you must specify this parameter.</p>
     * <blockquote>
     * <p>If you set this parameter to <strong>sca</strong>, application vulnerabilities and the vulnerabilities that are detected based on software component analysis are queried. If you do not specify this parameter, only application vulnerabilities are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("AttachTypes")
    public String attachTypes;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the vulnerabilities are fixed. Valid values:</p>
     * <ul>
     * <li><strong>y</strong>: yes</li>
     * <li><strong>n</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The ID of the asset group.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9207613</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The IDs of vulnerabilities. You can specify up to 50 IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>282,281,283</p>
     */
    @NameInMap("Ids")
    public String ids;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The alias of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>oval:com.redhat.rhsa:def:20172836</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>asap</strong>: high</li>
     * <li><strong>later</strong>: medium</li>
     * <li><strong>nntf</strong>: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap,later,nntf</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>E17B501887A2D3AA5E8360A6EFA3B***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The status of the vulnerability. Separate multiple statuses with commas (,). Valid values:</p>
     * <ul>
     * <li>1: unfixed</li>
     * <li>2: fix failed</li>
     * <li>3: rollback failed</li>
     * <li>4: being fixed</li>
     * <li>5: being rolled back</li>
     * <li>6: being verified</li>
     * <li>7: fixed</li>
     * <li>8: fixed and to be restarted</li>
     * <li>9: rolled back</li>
     * <li>10: ignored</li>
     * <li>11: rolled back and to be restarted</li>
     * <li>12: not found</li>
     * <li>20: expired</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
     * <li><strong>app</strong>: application vulnerability that is detected by using web scanner</li>
     * <li><strong>emg</strong>: urgent vulnerability.</li>
     * <li><strong>sca</strong>: application vulnerability that is detected by using software component analysis</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Specifies whether to use NextToken to query the data of vulnerabilities. If you set UseNextToken to true, the value of TotalCount is not returned. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The UUIDs of the servers on which you want to query the vulnerabilities. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUIDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1587bedb-fdb4-48c4-9330-****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the vulnerabilities are detected. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>ins-133****,ins-5414****</p>
     */
    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

    public static DescribeVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListRequest self = new DescribeVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulListRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeVulListRequest setAttachTypes(String attachTypes) {
        this.attachTypes = attachTypes;
        return this;
    }
    public String getAttachTypes() {
        return this.attachTypes;
    }

    public DescribeVulListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeVulListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeVulListRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DescribeVulListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVulListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVulListRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeVulListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVulListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeVulListRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeVulListRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public DescribeVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVulListRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public DescribeVulListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public DescribeVulListRequest setVpcInstanceIds(String vpcInstanceIds) {
        this.vpcInstanceIds = vpcInstanceIds;
        return this;
    }
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

}
