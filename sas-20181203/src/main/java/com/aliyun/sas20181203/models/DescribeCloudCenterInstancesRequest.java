// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. This parameter is in JSON format. Pay attention to the case sensitivity when you specify this parameter.</p>
     * <blockquote>
     * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query the supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;riskStatus&quot;,&quot;value&quot;:&quot;YES&quot;},{&quot;name&quot;:&quot;internetIp&quot;,&quot;value&quot;:&quot;1.2.XX.XX&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number to return from the query results. Default value: <strong>1</strong>, which indicates that query results are returned starting from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The asset vendor. Separate multiple vendors with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Alibaba Cloud asset</li>
     * <li><strong>1</strong>: non-cloud asset</li>
     * <li><strong>2</strong>: IDC asset</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>, <strong>14</strong>, <strong>16</strong>: third-party cloud asset</li>
     * <li><strong>8</strong>: lightweight asset</li>
     * <li><strong>9</strong>: SAE</li>
     * <li><strong>10</strong>: PAI</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Flags")
    public String flags;

    /**
     * <p>The importance level of the asset. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: important asset</li>
     * <li><strong>1</strong>: normal asset</li>
     * <li><strong>0</strong>: test asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Importance")
    public Integer importance;

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
     * <p>The logical relationship between multiple search conditions. Default value: <strong>OR</strong>. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions are in the <strong>OR</strong> relationship.</li>
     * <li><strong>AND</strong>: The search conditions are in the <strong>AND</strong> relationship.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The type of the asset that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong>: server</li>
     * <li><strong>cloud_product</strong>: cloud product</li>
     * <li><strong>eci</strong>: elastic container instance</li>
     * <li><strong>rund</strong>: RunD container instance</li>
     * <li><strong>runc</strong>: RunC container instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>The NextToken value returned when the NextToken method is used. Leave this parameter empty for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>E17B501887A2D3AA5E8360A6EFA3B***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Specifies whether to internationalize the default group name <strong>Ungrouped</strong>. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: does not internationalize the group name. If the value of the GroupTrace response parameter is the default group <strong>Ungrouped</strong> in Security Center, the group name is still displayed as <strong>Ungrouped</strong> in Chinese.</li>
     * <li><strong>false</strong>: internationalizes the group name. If the value of the GroupTrace response parameter is the default group <strong>Ungrouped</strong> in Security Center, the group name is displayed as <strong>default</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NoGroupTrace")
    public Boolean noGroupTrace;

    /**
     * <p>The number of entries per page in a paginated query. Default value: <strong>20</strong>, which indicates that 20 entries of asset information are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the instance you want to query resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    @Deprecated
    public String regionId;

    /**
     * <p>The Alibaba Cloud account ID of the member account in the resource directory.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Specifies whether to use the NextToken method to retrieve asset list data. If this parameter is used, the TotalCount parameter is no longer returned. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: uses the NextToken method.</li>
     * <li><strong>false</strong>: does not use the NextToken method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    public static DescribeCloudCenterInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudCenterInstancesRequest self = new DescribeCloudCenterInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudCenterInstancesRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeCloudCenterInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCloudCenterInstancesRequest setFlags(String flags) {
        this.flags = flags;
        return this;
    }
    public String getFlags() {
        return this.flags;
    }

    public DescribeCloudCenterInstancesRequest setImportance(Integer importance) {
        this.importance = importance;
        return this;
    }
    public Integer getImportance() {
        return this.importance;
    }

    public DescribeCloudCenterInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCloudCenterInstancesRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public DescribeCloudCenterInstancesRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public DescribeCloudCenterInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudCenterInstancesRequest setNoGroupTrace(Boolean noGroupTrace) {
        this.noGroupTrace = noGroupTrace;
        return this;
    }
    public Boolean getNoGroupTrace() {
        return this.noGroupTrace;
    }

    public DescribeCloudCenterInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    @Deprecated
    public DescribeCloudCenterInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCloudCenterInstancesRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeCloudCenterInstancesRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

}
