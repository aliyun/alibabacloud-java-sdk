// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultRequest extends TeaModel {
    /**
     * <p>The cloud service whose configuration check results you want to query. For more information about the check items for the cloud service, see the check item table in the &quot;Response parameters&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the check item that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: identity authentication and permissions</li>
     * <li><strong>2</strong>: network access control</li>
     * <li><strong>3</strong>: log audit</li>
     * <li><strong>4</strong>: data security</li>
     * <li><strong>5</strong>: monitoring and alerting</li>
     * <li><strong>6</strong>: basic security protection</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all types of check items are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>An array that consists of the IDs of check items. For more information about the check item, see the check item table in the &quot;Response parameters&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ItemIds")
    public java.util.List<String> itemIds;

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
     * <p>The name of the check item. For more information about the check item, see the check item table in the &quot;Response parameters&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>ALB_NetWorkAccessControl</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the check item is supported by the edition of Security Center that you purchase. Valid values:</p>
     * <ul>
     * <li><strong>enabled</strong>: yes</li>
     * <li><strong>disabled</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("QueryFlag")
    public String queryFlag;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The risk level of the check item that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the check results. Valid values:</p>
     * <ul>
     * <li><strong>pass</strong></li>
     * <li><strong>failed</strong></li>
     * <li><strong>running</strong></li>
     * <li><strong>waiting</strong></li>
     * <li><strong>ignored</strong></li>
     * <li><strong>falsePositive</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeRiskCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckResultRequest self = new DescribeRiskCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckResultRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public DescribeRiskCheckResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRiskCheckResultRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeRiskCheckResultRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

    public DescribeRiskCheckResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskCheckResultRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeRiskCheckResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRiskCheckResultRequest setQueryFlag(String queryFlag) {
        this.queryFlag = queryFlag;
        return this;
    }
    public String getQueryFlag() {
        return this.queryFlag;
    }

    public DescribeRiskCheckResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRiskCheckResultRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeRiskCheckResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeRiskCheckResultRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
