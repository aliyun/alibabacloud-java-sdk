// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The keyword that is used to search for data assets. DSC searches for data assets based on the keyword that you specify in fuzzy match mode. For example, if you specify data, all data assets whose names contain data are queried.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the service to which the data asset belongs, such as MaxCompute, OSS, and ApsaraDB RDS. For more information about the types of data assets from which DSC can scan for sensitive data, see [Supported data assets](~~212906~~).</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the service to which the data asset belongs. You can call the [DescribeDataAssets](~~DescribeDataAssets~~) operation to query the ID of the service.</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The sensitivity level ID of the data asset. A higher sensitivity level indicates that the identified data is more sensitive. Valid values:</p>
     * <br>
     * <p>*   **1**: No sensitive data is identified.</p>
     * <p>*   **2**: sensitive data at level 1.</p>
     * <p>*   **3**: sensitive data at level 2.</p>
     * <p>*   **4**: sensitive data at level 3</p>
     * <p>*   **5**: sensitive data at level 4.</p>
     * <p>*   **6**: sensitive data at level 5.</p>
     * <p>*   **7**: sensitive data at level 6.</p>
     * <p>*   **8**: sensitive data at level 7.</p>
     * <p>*   **9**: sensitive data at level 8.</p>
     * <p>*   **10**: sensitive data at level 9.</p>
     * <p>*   **11**: sensitive data at level 10.</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that the data asset hits. You can call the [DescribeRules](~~DescribeRules~~) operation and obtain the ID of the sensitive data detection rule from the **Id** response parameter.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The region where the data asset resides. For more information, see [Supported regions](~~214257~~).</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstancesRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstancesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeInstancesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeInstancesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeInstancesRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

}
