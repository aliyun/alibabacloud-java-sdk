// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultRequest extends TeaModel {
    // The type of the cloud service whose configuration assessment result you want to query. For more information about the description of the cloud service specified by this parameter, see the check item table in the "Response parameters" section of this topic.
    @NameInMap("AssetType")
    public String assetType;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The type of the check item that you want to query. Valid values:
    // 
    // *   **1**: identity authentication and permissions
    // *   **2**: network access control
    // *   **3**: log audit
    // *   **4**: data security
    // *   **5**: monitoring and alerting
    // *   **6**: basic security protection
    // 
    // >  If you do not specify this parameter, all types of check items are queried by default.
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("ItemIds")
    public java.util.List<String> itemIds;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The name of the check item. For more information about the description of the check item name, see the check item table in the "Response parameters" section of this topic.
    @NameInMap("Name")
    public String name;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // Specifies whether the check item is supported by the cloud service. Valid values:
    // 
    // *   **enabled**: The check item is supported by the cloud service.
    // *   **disabled**: The check item is not supported by the cloud service.
    @NameInMap("QueryFlag")
    public String queryFlag;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The risk level of the check item that you want to query. Valid values:
    // 
    // *   **high**
    // *   **medium**
    // *   **low**
    @NameInMap("RiskLevel")
    public String riskLevel;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The status of the check result. Valid values:
    // 
    // *   **pass**
    // *   **failed**
    // *   **running**
    // *   **waiting**
    // *   **ignored**
    // *   **falsePositive**
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
