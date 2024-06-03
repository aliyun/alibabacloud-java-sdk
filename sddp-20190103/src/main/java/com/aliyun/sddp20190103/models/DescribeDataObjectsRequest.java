// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DomainId")
    public Long domainId;

    @NameInMap("FeatureType")
    public Integer featureType;

    @NameInMap("FileCategoryCode")
    public Long fileCategoryCode;

    @NameInMap("FileType")
    public Long fileType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MemberAccount")
    public Long memberAccount;

    @NameInMap("ModelIds")
    public String modelIds;

    @NameInMap("ModelTagIds")
    public String modelTagIds;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ParentCategoryIds")
    public String parentCategoryIds;

    @NameInMap("ProductIds")
    public String productIds;

    @NameInMap("QueryName")
    public String queryName;

    @NameInMap("RiskLevels")
    public String riskLevels;

    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeDataObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectsRequest self = new DescribeDataObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataObjectsRequest setDomainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }
    public Long getDomainId() {
        return this.domainId;
    }

    public DescribeDataObjectsRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeDataObjectsRequest setFileCategoryCode(Long fileCategoryCode) {
        this.fileCategoryCode = fileCategoryCode;
        return this;
    }
    public Long getFileCategoryCode() {
        return this.fileCategoryCode;
    }

    public DescribeDataObjectsRequest setFileType(Long fileType) {
        this.fileType = fileType;
        return this;
    }
    public Long getFileType() {
        return this.fileType;
    }

    public DescribeDataObjectsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDataObjectsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataObjectsRequest setMemberAccount(Long memberAccount) {
        this.memberAccount = memberAccount;
        return this;
    }
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    public DescribeDataObjectsRequest setModelIds(String modelIds) {
        this.modelIds = modelIds;
        return this;
    }
    public String getModelIds() {
        return this.modelIds;
    }

    public DescribeDataObjectsRequest setModelTagIds(String modelTagIds) {
        this.modelTagIds = modelTagIds;
        return this;
    }
    public String getModelTagIds() {
        return this.modelTagIds;
    }

    public DescribeDataObjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataObjectsRequest setParentCategoryIds(String parentCategoryIds) {
        this.parentCategoryIds = parentCategoryIds;
        return this;
    }
    public String getParentCategoryIds() {
        return this.parentCategoryIds;
    }

    public DescribeDataObjectsRequest setProductIds(String productIds) {
        this.productIds = productIds;
        return this;
    }
    public String getProductIds() {
        return this.productIds;
    }

    public DescribeDataObjectsRequest setQueryName(String queryName) {
        this.queryName = queryName;
        return this;
    }
    public String getQueryName() {
        return this.queryName;
    }

    public DescribeDataObjectsRequest setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public String getRiskLevels() {
        return this.riskLevels;
    }

    public DescribeDataObjectsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeDataObjectsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
