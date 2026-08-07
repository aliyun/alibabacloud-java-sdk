// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Default value: <strong>1</strong>.</p>
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
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese (Simplified).</li>
     * <li><strong>en_us</strong>: English (US).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The search keyword. Fuzzy match is supported. For example, if you enter data, all data entries that contain data in the search item are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of data asset instances to return on each page in a paged query. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the product to which the data asset instance belongs, such as MaxCompute, OSS, or RDS. For supported product names, see <a href="https://help.aliyun.com/document_detail/212906.html">Data types from which sensitive data can be detected</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the product to which the data asset instance belongs. You can call the <a href="~~DescribeDataAssets~~">DescribeDataAssets</a> operation to obtain the product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The risk level ID of the data asset instance. A higher risk level ID indicates more sensitive data is detected. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: No sensitive data is detected. No risk.</li>
     * <li><strong>2</strong>: Sensitive data risk at level 1.</li>
     * <li><strong>3</strong>: Sensitive data risk at level 2.</li>
     * <li><strong>4</strong>: Sensitive data risk at level 3.</li>
     * <li><strong>5</strong>: Sensitive data risk at level 4.</li>
     * <li><strong>6</strong>: Sensitive data risk at level 5.</li>
     * <li><strong>7</strong>: Sensitive data risk at level 6.</li>
     * <li><strong>8</strong>: Sensitive data risk at level 7.</li>
     * <li><strong>9</strong>: Sensitive data risk at level 8.</li>
     * <li><strong>10</strong>: Sensitive data risk at level 9.</li>
     * <li><strong>11</strong>: Sensitive data risk at level 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that the data asset instance hits. You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation and obtain the rule ID from the <strong>Id</strong> response parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1111111</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The region of the data asset instance. For more information, see <a href="https://help.aliyun.com/document_detail/214257.html">Supported regions</a>.</p>
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
