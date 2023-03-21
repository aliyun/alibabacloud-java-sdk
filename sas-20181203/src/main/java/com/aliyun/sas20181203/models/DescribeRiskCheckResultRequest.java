// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultRequest extends TeaModel {
    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("ItemIds")
    public java.util.List<String> itemIds;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryFlag")
    public String queryFlag;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RiskLevel")
    public String riskLevel;

    @NameInMap("SourceIp")
    public String sourceIp;

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
