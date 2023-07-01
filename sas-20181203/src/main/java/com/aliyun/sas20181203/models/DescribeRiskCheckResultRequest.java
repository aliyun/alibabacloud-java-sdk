// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultRequest extends TeaModel {
    /**
     * <p>The cloud service whose configuration check results you want to query. For more information about the check items for the cloud service, see the check item table in the "Response parameters" section of this topic.</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The type of the check item that you want to query. Valid values:</p>
     * <br>
     * <p>*   **1**: identity authentication and permissions</p>
     * <p>*   **2**: network access control</p>
     * <p>*   **3**: log audit</p>
     * <p>*   **4**: data security</p>
     * <p>*   **5**: monitoring and alerting</p>
     * <p>*   **6**: basic security protection</p>
     * <br>
     * <p>> If you do not specify this parameter, all types of check items are queried.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the check item. For more information about the check item, see the check item table in the "Response parameters" section of this topic.</p>
     */
    @NameInMap("ItemIds")
    public java.util.List<String> itemIds;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the check item. For more information about the check item, see the check item table in the "Response parameters" section of this topic.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the check item is supported by the edition of Security Center that you purchase. Valid values:</p>
     * <br>
     * <p>*   **enabled**: yes</p>
     * <p>*   **disabled**: no</p>
     */
    @NameInMap("QueryFlag")
    public String queryFlag;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The risk level of the check item that you want to query. Valid values:</p>
     * <br>
     * <p>*   **high**</p>
     * <p>*   **medium**</p>
     * <p>*   **low**</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the check results. Valid values:</p>
     * <br>
     * <p>*   **pass**</p>
     * <p>*   **failed**</p>
     * <p>*   **running**</p>
     * <p>*   **waiting**</p>
     * <p>*   **ignored**</p>
     * <p>*   **falsePositive**</p>
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
