// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the data assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeInstancesResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>71064826-726F-4ADA-B879-05D8055476FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of data assets.</p>
     * 
     * <strong>example:</strong>
     * <p>231</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstancesResponseBody setItems(java.util.List<DescribeInstancesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyItemsModelTags extends TeaModel {
        /**
         * <p>The ID of the tag. Valid values:</p>
         * <ul>
         * <li><strong>101</strong>: personal sensitive information</li>
         * <li><strong>102</strong>: personal information</li>
         * <li><strong>107</strong>: general information</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the tag. Valid values:</p>
         * <ul>
         * <li>Personal sensitive information</li>
         * <li>Personal information</li>
         * <li>General information</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>personal sensitive data</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeInstancesResponseBodyItemsModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyItemsModelTags self = new DescribeInstancesResponseBodyItemsModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyItemsModelTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeInstancesResponseBodyItemsModelTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstancesResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the data asset was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637226782000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The name of the department to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>***DemoCenter</p>
         */
        @NameInMap("DepartName")
        public String departName;

        /**
         * <p>The unique ID of the data asset in DSC.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Data asset Information 1</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The security status of the data asset. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The data asset is secure.</li>
         * <li><strong>false</strong>: The data asset is insecure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Labelsec")
        public Boolean labelsec;

        /**
         * <p>The time when the data asset was last scanned. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637622793000</p>
         */
        @NameInMap("LastFinishTime")
        public Long lastFinishTime;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeInstancesResponseBodyItemsModelTags> modelTags;

        /**
         * <p>The name of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>gxdata</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OdpsRiskLevelName")
        public String odpsRiskLevelName;

        /**
         * <p>The Alibaba Cloud account to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>dtdep-239-******</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the service to which the data asset belongs, such as MaxCompute, OSS, and ApsaraDB RDS. For more information about the types of data assets that DSC can scan to detect sensitive data, see <a href="https://help.aliyun.com/document_detail/212906.html">Supported data assets</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the service to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The protection status of the data asset. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The data asset is being protected.</li>
         * <li><strong>false</strong>: The data asset is not protected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Protection")
        public Boolean protection;

        /**
         * <p>The ID of the sensitivity level for the data asset. A higher sensitivity level ID indicates that the identified data is more sensitive.</p>
         * <ul>
         * <li><strong>1</strong>: No sensitive data is detected.</li>
         * <li><strong>2</strong>: sensitive data at level 1.</li>
         * <li><strong>3</strong>: sensitive data at level 2.</li>
         * <li><strong>4</strong>: sensitive data at level 3.</li>
         * <li><strong>5</strong>: sensitive data at level 4.</li>
         * <li><strong>6</strong>: sensitive data at level 5.</li>
         * <li><strong>7</strong>: sensitive data at level 6.</li>
         * <li><strong>8</strong>: sensitive data at level 7.</li>
         * <li><strong>9</strong>: sensitive data at level 8.</li>
         * <li><strong>10</strong>: sensitive data at level 9.</li>
         * <li><strong>11</strong>: sensitive data at level 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskLevelId")
        public Long riskLevelId;

        /**
         * <p>The name of the sensitivity level for the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Sensitive data at level 1</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The name of the sensitive data detection rule that the data asset hits.</p>
         * 
         * <strong>example:</strong>
         * <p>\<em>\</em>\* rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the data asset contains sensitive data. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The number of sensitive data objects in the data asset. For example, if the data asset is an ApsaraDB RDS instance, the value indicates the number of sensitive tables in all databases of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SensitiveCount")
        public Integer sensitiveCount;

        /**
         * <p>The name of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>Tenant 1</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The total number of data objects in the data asset. For example, if the data asset is an ApsaraDB RDS instance, the value indicates the total number of tables in all databases of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>231</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeInstancesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyItems self = new DescribeInstancesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribeInstancesResponseBodyItems setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public DescribeInstancesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeInstancesResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeInstancesResponseBodyItems setLabelsec(Boolean labelsec) {
            this.labelsec = labelsec;
            return this;
        }
        public Boolean getLabelsec() {
            return this.labelsec;
        }

        public DescribeInstancesResponseBodyItems setLastFinishTime(Long lastFinishTime) {
            this.lastFinishTime = lastFinishTime;
            return this;
        }
        public Long getLastFinishTime() {
            return this.lastFinishTime;
        }

        public DescribeInstancesResponseBodyItems setModelTags(java.util.List<DescribeInstancesResponseBodyItemsModelTags> modelTags) {
            this.modelTags = modelTags;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyItemsModelTags> getModelTags() {
            return this.modelTags;
        }

        public DescribeInstancesResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesResponseBodyItems setOdpsRiskLevelName(String odpsRiskLevelName) {
            this.odpsRiskLevelName = odpsRiskLevelName;
            return this;
        }
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        public DescribeInstancesResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeInstancesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeInstancesResponseBodyItems setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public DescribeInstancesResponseBodyItems setProtection(Boolean protection) {
            this.protection = protection;
            return this;
        }
        public Boolean getProtection() {
            return this.protection;
        }

        public DescribeInstancesResponseBodyItems setRiskLevelId(Long riskLevelId) {
            this.riskLevelId = riskLevelId;
            return this;
        }
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public DescribeInstancesResponseBodyItems setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public DescribeInstancesResponseBodyItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeInstancesResponseBodyItems setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public DescribeInstancesResponseBodyItems setSensitiveCount(Integer sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        public DescribeInstancesResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeInstancesResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
