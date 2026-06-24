// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The page number of the paged query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>.
     * Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en_us</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The keyword to search for. Fuzzy match is supported. For example, if you enter &quot;data&quot;, all data that contains &quot;data&quot; is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of data asset instances to return on each page of a paged query. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the product to which the data asset instance belongs, such as MaxCompute, OSS, or RDS. For more information about the supported products, see <a href="https://help.aliyun.com/document_detail/212906.html">Data assets that can be scanned for sensitive data</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the product to which the data asset instance belongs. You can call the <a href="~~DescribeDataAssets~~">DescribeDataAssets</a> operation to query the product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The ID of the threat level for the data asset instance. The higher the threat level ID, the more sensitive the data. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: No sensitive data is detected. No threat.</p>
     * </li>
     * <li><p><strong>2</strong>: Threat level 1.</p>
     * </li>
     * <li><p><strong>3</strong>: Threat level 2.</p>
     * </li>
     * <li><p><strong>4</strong>: Threat level 3.</p>
     * </li>
     * <li><p><strong>5</strong>: Threat level 4.</p>
     * </li>
     * <li><p><strong>6</strong>: Threat level 5.</p>
     * </li>
     * <li><p><strong>7</strong>: Threat level 6.</p>
     * </li>
     * <li><p><strong>8</strong>: Threat level 7.</p>
     * </li>
     * <li><p><strong>9</strong>: Threat level 8.</p>
     * </li>
     * <li><p><strong>10</strong>: Threat level 9.</p>
     * </li>
     * <li><p><strong>11</strong>: Threat level 10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that the data asset instance hits. You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation and view the value of the <strong>Id</strong> parameter in the response to obtain the rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The region where the data asset instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/214257.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
