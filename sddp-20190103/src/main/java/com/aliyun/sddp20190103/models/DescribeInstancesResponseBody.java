// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The details of the data asset instances.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeInstancesResponseBodyItems> items;

    /**
     * <p>The number of data asset instances returned on each page.</p>
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
     * <p>The total number of data asset instances.</p>
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
         * <p>The ID of the data label. Valid values:</p>
         * <ul>
         * <li><p><strong>101</strong>: Personal sensitive information</p>
         * </li>
         * <li><p><strong>102</strong>: Personal information</p>
         * </li>
         * <li><p><strong>107</strong>: General information</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data label. Valid values:</p>
         * <ul>
         * <li><p>Personal sensitive information</p>
         * </li>
         * <li><p>Personal information</p>
         * </li>
         * <li><p>General information</p>
         * </li>
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
         * <p>The time when the data asset instance was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637226782000</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The name of the department to which the data asset instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>***DemoCenter</p>
         */
        @NameInMap("DepartName")
        public String departName;

        /**
         * <p>The unique ID of the data asset instance that is recorded in Data Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the data asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance dscription</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The security status of the data asset instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: secure</p>
         * </li>
         * <li><p><strong>false</strong>: insecure</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Labelsec")
        public Boolean labelsec;

        /**
         * <p>The time when the last scan of the data asset instance was completed. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637622793000</p>
         */
        @NameInMap("LastFinishTime")
        public Long lastFinishTime;

        /**
         * <p>If multi-account management is enabled and the asset belongs to a member account, this parameter indicates the UID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>12567890126</p>
         */
        @NameInMap("MemberAliUid")
        public String memberAliUid;

        /**
         * <p>The list of data labels.</p>
         */
        @NameInMap("ModelTags")
        public java.util.List<DescribeInstancesResponseBodyItemsModelTags> modelTags;

        /**
         * <p>The name of the data asset instance.</p>
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
         * <p>The Alibaba Cloud account that owns the data asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtdep-239-******</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the product to which the data asset instance belongs, such as MaxCompute, OSS, or RDS. For more information about the supported products, see <a href="https://help.aliyun.com/document_detail/212906.html">Data assets that can be scanned for sensitive data</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The ID of the product to which the data asset instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The protection status of the data asset instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The instance is protected.</p>
         * </li>
         * <li><p><strong>false</strong>: The instance is not protected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Protection")
        public Boolean protection;

        /**
         * <p>The ID of the threat level for the data asset instance. The higher the threat level ID, the more sensitive the data.</p>
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
         * <p>The name of the threat level for the data asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>S1</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The name of the sensitive data detection rule that the data asset instance hits.</p>
         * 
         * <strong>example:</strong>
         * <p>*** rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the data asset instance contains sensitive data. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes</p>
         * </li>
         * <li><p><strong>false</strong>: no</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        /**
         * <p>The total amount of sensitive data in the data asset instance. For example, if the data asset is an RDS instance, this parameter indicates the total number of sensitive tables in the instance.</p>
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
         * <p>tenant</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The total amount of data in the data asset instance. For example, if the data asset is an RDS instance, this parameter indicates the total number of tables in the instance.</p>
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

        public DescribeInstancesResponseBodyItems setMemberAliUid(String memberAliUid) {
            this.memberAliUid = memberAliUid;
            return this;
        }
        public String getMemberAliUid() {
            return this.memberAliUid;
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
